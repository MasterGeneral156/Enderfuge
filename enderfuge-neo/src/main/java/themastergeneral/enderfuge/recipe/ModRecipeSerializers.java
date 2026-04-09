/**
 * Project      : enderfuge-neo
 * Package      : themastergeneral.enderfuge.recipe
 * Author       : TheMasterGeneral
 * Created:     : Jan, 18, 2026 (6:34 PM)
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

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, "enderfuge");

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<EnderfugeRecipe>>
            ENDERFUGE = SERIALIZERS.register("enderfuge", EnderfugeRecipeSerializer::new);
}

