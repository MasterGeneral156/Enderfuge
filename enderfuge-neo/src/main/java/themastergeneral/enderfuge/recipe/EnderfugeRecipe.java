/**
 * Project      : enderfuge-neo
 * Package      : themastergeneral.enderfuge.recipe
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
package themastergeneral.enderfuge.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public class EnderfugeRecipe implements Recipe<EnderfugeRecipeInput> {

    private final Ingredient ingredient;
    private final ItemStack result;
    private final int cookTime;
    private final ResourceLocation id;

    public EnderfugeRecipe(ResourceLocation id,
                           Ingredient ingredient,
                           ItemStack result,
                           int cookTime) {
        this.id = id;
        this.ingredient = ingredient;
        this.result = result;
        this.cookTime = cookTime;
    }

    @Override
    public boolean matches(EnderfugeRecipeInput input, Level level) {
        return ingredient.test(input.getItem(0));
    }

    @Override
    public ItemStack assemble(EnderfugeRecipeInput input, HolderLookup.Provider provider) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return result;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.ENDERFUGE.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipeTypes.ENDERFUGE.get();
    }


    public ResourceLocation getId() {
        return id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getCookTime() {
        return cookTime;
    }
}



