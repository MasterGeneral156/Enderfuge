/**
 * Project      : enderfuge-neo
 * Package      : themastergeneral.enderfuge.block.entity
 * Author       : TheMasterGeneral
 * Created:     : Jan, 18, 2026 (6:21 PM)
 * <p>
 * Github       : https://github.com/MasterGeneral156
 * Curseforge   : https://www.curseforge.com/members/themastergeneral/projects
 * Modrinth     : https://modrinth.com/user/MasterGeneral156
 * <p>
 * License      : MIT License
 * Copyright (c) 2026 TheMasterGeneral
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package themastergeneral.enderfuge.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import themastergeneral.enderfuge.fuel.EnderfugeFuelLoader;
import themastergeneral.enderfuge.recipe.EnderfugeRecipe;
import themastergeneral.enderfuge.recipe.EnderfugeRecipeInput;
import themastergeneral.enderfuge.recipe.ModRecipeTypes;

import java.util.Optional;

public class EnderfugeBlockEntity extends BlockEntity {

    /* ==================== Inventory ==================== */

    private final NonNullList<ItemStack> items =
            NonNullList.withSize(3, ItemStack.EMPTY);


    /* ==================== Timers ==================== */

    private int burnTime;
    private int burnTimeTotal;
    private int cookTime;
    private int cookTimeTotal;

    public EnderfugeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ENDERFUGE.get(), pos, state);
    }

    /* ==================== TICK ==================== */

    public static void tick(Level level, BlockPos pos, BlockState state, EnderfugeBlockEntity be) {
        if (level.isClientSide) return;

        boolean burning = be.burnTime > 0;

        if (burning) {
            be.burnTime--;
        }

        ItemStack fuel = be.items.get(1);
        ItemStack inputStack = be.items.get(0);

        EnderfugeRecipeInput recipeInput =
                new EnderfugeRecipeInput(inputStack);

        Optional<RecipeHolder<EnderfugeRecipe>> recipeHolder =
                level.getRecipeManager()
                        .getRecipeFor(ModRecipeTypes.ENDERFUGE.get(), recipeInput, level);

        Optional<EnderfugeRecipe> recipe =
                recipeHolder.map(RecipeHolder::value);


        if (be.burnTime <= 0 && recipe.isPresent()) {
            int fuelBurn = EnderfugeFuelLoader.getBurnTime(fuel);
            if (fuelBurn > 0) {
                be.burnTime = fuelBurn;
                be.burnTimeTotal = fuelBurn;
                fuel.shrink(1);
            }
        }

        if (be.burnTime > 0 && recipe.isPresent()) {
            be.cookTime++;
            be.cookTimeTotal = recipe.get().getCookTime();

            if (be.cookTime >= be.cookTimeTotal) {
                be.finishRecipe(recipe.get());
                be.cookTime = 0;
            }
        } else {
            be.cookTime = 0;
        }

        if (burning != (be.burnTime > 0)) {
            be.setChanged();
        }
    }

    /* ==================== RECIPE FINISH ==================== */

    private void finishRecipe(EnderfugeRecipe recipe) {
        ItemStack result = recipe.getResultItem(null);
        ItemStack output = items.get(2);

        if (output.isEmpty()) {
            items.set(2, result.copy());
        } else if (ItemStack.isSameItemSameComponents(output, result)) {
            output.grow(result.getCount());
        }

        items.get(0).shrink(1);
        setChanged();
    }

    /* ==================== INVENTORY ACCESS ==================== */

    public ItemStack getItem(int slot) {
        return items.get(slot);
    }

    public void setItem(int slot, ItemStack stack) {
        items.set(slot, stack);
        setChanged();
    }

    public boolean canPlaceItem(int slot, ItemStack stack) {
        if (slot == 2) return false; // output
        if (slot == 1) return EnderfugeFuelLoader.getBurnTime(stack) > 0;
        return true;
    }

    /* ==================== SAVE / LOAD ==================== */

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        super.saveAdditional(tag, provider);
        ContainerHelper.saveAllItems(tag, items, provider);
        tag.putInt("BurnTime", burnTime);
        tag.putInt("BurnTimeTotal", burnTimeTotal);
        tag.putInt("CookTime", cookTime);
        tag.putInt("CookTimeTotal", cookTimeTotal);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        super.loadAdditional(tag, provider);
        ContainerHelper.loadAllItems(tag, items, provider);
        burnTime = tag.getInt("BurnTime");
        burnTimeTotal = tag.getInt("BurnTimeTotal");
        cookTime = tag.getInt("CookTime");
        cookTimeTotal = tag.getInt("CookTimeTotal");
    }


    /* ==================== GUI HELPERS ==================== */

    public int getCookProgressScaled(int pixels) {
        return cookTimeTotal > 0 ? cookTime * pixels / cookTimeTotal : 0;
    }

    public int getBurnProgressScaled(int pixels) {
        return burnTimeTotal > 0 ? burnTime * pixels / burnTimeTotal : 0;
    }
}
