package com.themastergeneral.enderfuge.common.config;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.proxy.CommonProxy;

public class Config {

	private static final String CATEGORY_GENERAL = "General";
	public static int smeltTime = 400;
	public static int pearlFuelTime = 1600;
	public static int eyeFuelTime = 5600;
	public static int crystalFuelTime = 25000;
	public static int dragonEggFuelTime = 50000;
	public static int shulkerShellFuelTime = 800;
	public static boolean creativeFuelItems = true;

	private static final String CATEGORY_INTEGRATION = "Integration";
	public static boolean ic2compat = true;
	public static boolean tfcompat = true;
	public static boolean eu2compat = true;
	public static boolean pslcompat = true;

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			Enderfuge.logger.log(Level.ERROR, "Problem loading config file!",
					e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL,
				"General configuration for the Enderfuge mod.");
		smeltTime = cfg.getInt("Smelting Time", CATEGORY_GENERAL, smeltTime, 1,
				65655, "How many ticks between a successful smelt.");
		pearlFuelTime = cfg.getInt("Ender Pearl Fuel Length", CATEGORY_GENERAL,
				pearlFuelTime, 1, 65655,
				"How many ticks an Ender Pearl will fuel the Enderfuge.");
		eyeFuelTime = cfg.getInt("Eye of Ender Fuel Length", CATEGORY_GENERAL,
				eyeFuelTime, 1, 65655,
				"How many ticks an Eye of Ender will fuel the Enderfuge.");
		crystalFuelTime = cfg.getInt("End Crystal Fuel Length",
				CATEGORY_GENERAL, crystalFuelTime, 1, 65655,
				"How many ticks an End Crystal will fuel the Enderfuge.");
		dragonEggFuelTime = cfg.getInt("Dragon Egg Fuel Length",
				CATEGORY_GENERAL, dragonEggFuelTime, 1, 65655,
				"How many ticks a Dragon Egg will fuel the Enderfuge.");
		shulkerShellFuelTime = cfg.getInt("Shulker Shell Fuel Length",
				CATEGORY_GENERAL, shulkerShellFuelTime, 1, 65655,
				"How many ticks a Shulker Shell will fuel the Enderfuge.");
		creativeFuelItems = cfg.getBoolean("Creative Fuel Items", CATEGORY_INTEGRATION,
				creativeFuelItems, "Enable the creative fuel items? They're silly and probably stupidly balanced. You've been warned.");

		// Integration Options
		cfg.addCustomCategoryComment(CATEGORY_INTEGRATION,
				"Integration in EnderFuge.");
		ic2compat = cfg.getBoolean("IC2 Integration", CATEGORY_INTEGRATION,
				ic2compat, "Enable integration with IC2?");
		tfcompat = cfg.getBoolean("Thermal Foundation Integration", CATEGORY_INTEGRATION,
				tfcompat, "Enable integration with Thermal Foundation?");
		eu2compat = cfg.getBoolean("Extra Utilities 2 Integration", CATEGORY_INTEGRATION,
				eu2compat, "Enable integration with Extra Utilities?");
		pslcompat = cfg.getBoolean("Pumpkin Spice Latte Integration", CATEGORY_INTEGRATION,
				pslcompat, "Enable integration with Pumpkin Spice Latte?");
	}
}
