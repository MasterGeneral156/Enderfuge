package com.themastergeneral.enderfuge.integration;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.themastergeneral.ctdcore.helpers.StackHelper;

public class EU2Integration {

	public static void loadEU2() {
		fuel();
		smelt();
	}

	public static void fuel() {
		Integration
				.addEnderfugeFuel(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("extrautils2:ingredients"),
								1, 13), 20);
		Integration
				.addEnderfugeFuel(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("extrautils2:ingredients"),
								1, 4), 5600);
	}

	public static void smelt() {
		/*Integration.addSmeltingRecipe(
				new ItemStack(StackHelper
						.itemFromRegistryName("extrautils2:endershard"), 8),
				new ItemStack(Items.ENDER_PEARL), 0.7F);*/
	}
}
