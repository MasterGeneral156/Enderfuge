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
}
