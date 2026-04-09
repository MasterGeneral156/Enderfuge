/**
 * Project      : enderfuge-neo
 * Package      : themastergeneral.enderfuge.fuel
 * Author       : TheMasterGeneral
 * Created:     : Jan, 18, 2026 (6:22 PM)
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
package themastergeneral.enderfuge.fuel;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import themastergeneral.enderfuge.Enderfuge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EnderfugeFuelLoader extends SimpleJsonResourceReloadListener {

    public static final List<EnderfugeFuel> FUELS = new ArrayList<>();

    public EnderfugeFuelLoader() {
        super(new Gson(), "enderfuge_fuels");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> map,
                         ResourceManager manager,
                         ProfilerFiller profiler) {
        FUELS.clear();
        map.forEach((id, json) -> {
            JsonObject obj = json.getAsJsonObject();
            Ingredient ingredient =
                    Ingredient.CODEC
                            .parse(JsonOps.INSTANCE, obj.get("ingredient"))
                            .resultOrPartial(msg ->
                                    Enderfuge.LOGGER.error("Failed to load Enderfuge fuel {}: {}", id, msg)
                            )
                            .orElse(Ingredient.EMPTY);

            int burnTime = obj.get("burnTime").getAsInt();
            FUELS.add(new EnderfugeFuel(ingredient, burnTime));
        });
    }

    public static int getBurnTime(ItemStack stack) {
        for (EnderfugeFuel fuel : FUELS) {
            if (fuel.ingredient().test(stack)) {
                return fuel.burnTime();
            }
        }
        return 0;
    }
}

