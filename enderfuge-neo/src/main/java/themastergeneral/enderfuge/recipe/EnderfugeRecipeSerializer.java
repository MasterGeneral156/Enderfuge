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

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class EnderfugeRecipeSerializer implements RecipeSerializer<EnderfugeRecipe> {

    /* ==================== JSON ==================== */

    public static final MapCodec<EnderfugeRecipe> CODEC =
            RecordCodecBuilder.mapCodec(instance ->
                    instance.group(
                            Ingredient.CODEC.fieldOf("ingredient")
                                    .forGetter(EnderfugeRecipe::getIngredient),

                            ItemStack.CODEC.fieldOf("result")
                                    .forGetter(r -> r.getResultItem(null)),

                            Codec.INT.optionalFieldOf("cookTime", 200)
                                    .forGetter(EnderfugeRecipe::getCookTime)
                    ).apply(instance,
                            (ingredient, result, cookTime) ->
                                    new EnderfugeRecipe(null, ingredient, result, cookTime)
                    )
            );

    /* ==================== NETWORK ==================== */

    public static final StreamCodec<RegistryFriendlyByteBuf, EnderfugeRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC,
                    EnderfugeRecipe::getIngredient,

                    ItemStack.STREAM_CODEC,
                    r -> r.getResultItem(null),

                    ByteBufCodecs.VAR_INT,
                    EnderfugeRecipe::getCookTime,

                    (ingredient, result, cookTime) ->
                            new EnderfugeRecipe(null, ingredient, result, cookTime)
            );

    @Override
    public MapCodec<EnderfugeRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, EnderfugeRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}


