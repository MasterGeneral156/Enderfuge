package com.themastergeneral.enderfuge.integration;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.config.Config;
import com.themastergeneral.enderfuge.common.items.ModItems;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;
import com.themastergeneral.enderfuge.utils.ItemHelper;

public class Integration {
	public static void loadIntegration() {
		loadIC2();
	}

	public static void loadIC2() {
		if (Config.ic2compat) {
			Enderfuge.logger.error(Item.REGISTRY.getKeys());
			/*EnderfugeRecipes.addSmeltingRecipe(
					new ItemStack(ItemHelper
							.returnItemFromRegistryName("ic2:bronze_sword")),
					new ItemStack(ModItems.nuggetdiamond), 0.7F);*/
		}
	}
}
