package com.themastergeneral.enderfuge.integration;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.themastergeneral.enderfuge.common.config.Config;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;
import com.themastergeneral.enderfuge.utils.ItemHelper;

public class Integration {
	public static void loadIntegration() {
		loadIC2();
	}

	public static void loadIC2() {
		if (Config.ic2compat) {
			// Iron Stuff
			EnderfugeRecipes.addSmeltingRecipe(
					new ItemStack(ItemHelper
							.returnItemFromRegistryName("ic2:bronze_sword"), 1,
							OreDictionary.WILDCARD_VALUE),
					new ItemStack(ItemHelper.returnItemFromRegistryName("ic2:ingot"),
							1, 1), 0.7F);
		}
	}
}
