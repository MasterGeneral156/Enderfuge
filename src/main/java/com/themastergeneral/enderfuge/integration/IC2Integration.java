package com.themastergeneral.enderfuge.integration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.themastergeneral.ctdcore.helpers.StackHelper;
import com.themastergeneral.enderfuge.common.items.ModItems;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

public class IC2Integration {

	public static void loadRecipes() {
		Integration.addRecipeByName("ic2:bronze_boots", "ic2:ingot", 2, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_chestplate", "ic2:ingot", 6, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_sword", "ic2:ingot", 1, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_helmet", "ic2:ingot", 3, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_boots", "ic2:ingot", 2, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_leggings", "ic2:ingot", 5, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_axe", "ic2:ingot", 2, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_hoe", "ic2:ingot", 1, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_pickaxe", "ic2:ingot", 2, 1, 0.7F);
		Integration.addRecipeByName("ic2:bronze_shovel", "ic2:ingot", 1, 1, 0.7F);
		
		Integration.addRecipeByName("ic2:nano_boots", "ic2:crafting", 2, 15, 0.7F);
		Integration.addRecipeByName("ic2:nano_chestplate", "ic2:crafting", 3, 15, 0.7F);
		Integration.addRecipeByName("ic2:nano_helmet", "ic2:crafting", 2, 15, 0.7F);
		Integration.addRecipeByName("ic2:nano_leggings", "ic2:crafting", 3, 15, 0.7F);
		
		// Fuel...
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper.itemFromRegistryName("ic2:nuclear"), 1,
						0), 50000);
	}
}
