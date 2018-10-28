package com.themastergeneral.enderfuge.integration;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.config.Config;
import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

public class Integration {
	public static void loadIntegration() {
		loadIC2();
		loadTF();
		loadEU2();
		loadPSL();
	}

	public static void addSmeltingRecipe(ItemStack input, ItemStack stack,
			float experience) {
		EnderfugeRecipes.instance().addSmeltingRecipe(input, stack, experience);
	}

	public static void addEnderfugeFuel(ItemStack input, int burntime) {
		EnderfugeFuel.instance().addEnderfugeFuel(input, burntime);
	}

	public static void loadIC2() {
		if (Config.ic2compat && Loader.isModLoaded("ic2")) {
			IC2Integration.loadRecipes();
			Enderfuge.logger.info("Loading IC2 integration.");
		} else {
			Enderfuge.logger
					.info("IC2 integration disabled, or IC2 not loaded.");
		}
	}

	public static void loadTF() {
		if (Config.tfcompat && Loader.isModLoaded("thermalfoundation")) {
			TFIntegration.lead();
			Enderfuge.logger.info("Loading Thermal Foundation integration.");
		} else {
			Enderfuge.logger
					.info("Thermal Foundation integration disabled, or Thermal Foundation not loaded.");
		}
	}
	
	public static void loadEU2()
	{
		if (Config.eu2compat && Loader.isModLoaded("extrautils2")) {
			EU2Integration.loadEU2();
			Enderfuge.logger.info("Loading Extra Utilities 2 integration.");
		} else {
			Enderfuge.logger
					.info("Extra Utilities 2 integration disabled, or Extra Utilities 2 not loaded.");
		}
	}
	
	public static void loadPSL()
	{
		if (Config.pslcompat && Loader.isModLoaded("pumpkinspice")) {
			PSLIntegration.load();
			Enderfuge.logger.info("Loading Pumpkin Spice Latte integration.");
		} else {
			Enderfuge.logger
					.info("Pumpkin Spice Latte integration disabled, or Extra Utilities 2 not loaded.");
		}
	}
}
