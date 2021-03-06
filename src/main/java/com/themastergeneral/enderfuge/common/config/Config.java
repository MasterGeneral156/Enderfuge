package com.themastergeneral.enderfuge.common.config;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.proxy.CommonProxy;

public class Config {

	//Common
	public static int smeltTime = 400;
	public static int pearlFuelTime = 1600;
	public static int eyeFuelTime = 5600;
	public static int crystalFuelTime = 25000;
	public static int dragonEggFuelTime = 50000;
	public static int shulkerShellFuelTime = 800;
	public static boolean keepInventory = false;
	
	//Integration
	public static boolean ic2compat = true;
	public static boolean tfcompat = true;
	public static boolean eu2compat = true;
	public static boolean pslcompat = true;
	
	//Client
	public static boolean stfu = false;
	public static float enderfugeVol = 1.0F;

	
	private static final String CATEGORY_GENERAL = "Balance";
	private static final String CATEGORY_INTEGRATION = "Integration";
	private static final String CATEGORY_MISC = "Miscellaneous";
	private static final String CATEGORY_CLIENT = "Client";
	public static boolean creativeFuelItems = true;

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
				"General balance for Enderfuge.");
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
		keepInventory = cfg.getBoolean("Enderfuge item purge.", CATEGORY_GENERAL,
				keepInventory, "Enable the Enderfuge deleting the items inside of it when its broke.");

		// Misc Options
		cfg.addCustomCategoryComment(CATEGORY_MISC, "Miscellaneous");
		creativeFuelItems = cfg
				.getBoolean(
						"Creative Fuel Items",
						CATEGORY_MISC,
						creativeFuelItems,
						"Enable the creative fuel items? They're silly and probably stupidly balanced. You've been warned.");

		// Integration Options
		cfg.addCustomCategoryComment(CATEGORY_INTEGRATION,
				"Integration in EnderFuge.");
		ic2compat = cfg.getBoolean("IC2 Integration", CATEGORY_INTEGRATION,
				ic2compat, "Enable integration with IC2?");
		tfcompat = cfg.getBoolean("Thermal Foundation Integration",
				CATEGORY_INTEGRATION, tfcompat,
				"Enable integration with Thermal Foundation?");
		eu2compat = cfg.getBoolean("Extra Utilities 2 Integration",
				CATEGORY_INTEGRATION, eu2compat,
				"Enable integration with Extra Utilities?");
		pslcompat = cfg.getBoolean("Pumpkin Spice Latte Integration",
				CATEGORY_INTEGRATION, pslcompat,
				"Enable integration with Pumpkin Spice Latte?");
		
		// Misc Options
				cfg.addCustomCategoryComment(CATEGORY_CLIENT, "Client side only");
				stfu = cfg
						.getBoolean(
								"Enderfuge STFU",
								CATEGORY_CLIENT,
								stfu,
								"Enable if you want the Enderfuge to STFU.");
				enderfugeVol = cfg.getFloat("Enderfuge Volume", CATEGORY_CLIENT, enderfugeVol, 0.1F, 1.0F, "How loud do you want the Enderfuge?");
	}
}
