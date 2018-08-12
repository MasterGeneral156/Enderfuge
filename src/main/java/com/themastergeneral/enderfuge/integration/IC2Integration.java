package com.themastergeneral.enderfuge.integration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.themastergeneral.enderfuge.common.items.ModItems;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;
import com.themastergeneral.enderfuge.utils.ItemUtils;

public class IC2Integration {

	public static void loadRecipes() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_boots"), 1,
								OreDictionary.WILDCARD_VALUE), new ItemStack(
								ItemUtils.itemFromRegistryName("ic2:ingot"), 2,
								1), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_chestplate"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:ingot"), 6, 1), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_sword"), 1,
								OreDictionary.WILDCARD_VALUE), new ItemStack(
								ItemUtils.itemFromRegistryName("ic2:ingot"), 1,
								1), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_helmet"), 1,
								OreDictionary.WILDCARD_VALUE), new ItemStack(
								ItemUtils.itemFromRegistryName("ic2:ingot"), 3,
								1), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_leggings"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:ingot"), 5, 1), 0.7F);
		Integration.addSmeltingRecipe(
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:bronze_axe"),
						1, OreDictionary.WILDCARD_VALUE), new ItemStack(
						ItemUtils.itemFromRegistryName("ic2:ingot"), 2, 1),
				0.7F);
		Integration.addSmeltingRecipe(
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:bronze_hoe"),
						1, OreDictionary.WILDCARD_VALUE), new ItemStack(
						ItemUtils.itemFromRegistryName("ic2:ingot"), 1, 1),
				0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_pickaxe"), 1,
								OreDictionary.WILDCARD_VALUE), new ItemStack(
								ItemUtils.itemFromRegistryName("ic2:ingot"), 2,
								1), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(ItemUtils
								.itemFromRegistryName("ic2:bronze_shovel"), 1,
								OreDictionary.WILDCARD_VALUE), new ItemStack(
								ItemUtils.itemFromRegistryName("ic2:ingot"), 1,
								1), 0.7F);

		Integration.addSmeltingRecipe(
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:nano_boots"),
						1, OreDictionary.WILDCARD_VALUE), new ItemStack(
						ItemUtils.itemFromRegistryName("ic2:crafting"), 2, 15),
				0.7F);
		Integration.addSmeltingRecipe(
				new ItemStack(ItemUtils
						.itemFromRegistryName("ic2:nano_chestplate"), 1,
						OreDictionary.WILDCARD_VALUE),
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:crafting"),
						3, 15), 0.7F);
		Integration.addSmeltingRecipe(
				new ItemStack(
						ItemUtils.itemFromRegistryName("ic2:nano_helmet"), 1,
						OreDictionary.WILDCARD_VALUE),
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:crafting"),
						2, 15), 0.7F);
		Integration.addSmeltingRecipe(
				new ItemStack(ItemUtils
						.itemFromRegistryName("ic2:nano_leggings"), 1,
						OreDictionary.WILDCARD_VALUE),
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:crafting"),
						3, 15), 0.7F);
		// Fuel...
		Integration.addEnderfugeFuel(
				new ItemStack(ItemUtils.itemFromRegistryName("ic2:nuclear"), 1,
						0), 50000);
	}
}
