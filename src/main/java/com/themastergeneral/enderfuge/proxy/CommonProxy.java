package com.themastergeneral.enderfuge.proxy;

import java.io.File;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.client.gui.GUIHandler;
import com.themastergeneral.enderfuge.common.blocks.ModBlocks;
import com.themastergeneral.enderfuge.common.config.Config;
import com.themastergeneral.enderfuge.common.items.ModItems;
import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	// Config instance
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(),
				"ctd/enderfuge.cfg"));
		Config.readConfig();
		ModBlocks.registerBlocks();
		ModItems.registerBlocks();
	}

	public void init(FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Enderfuge.instance,
				new GUIHandler());
	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TEEnderfuge.class, Enderfuge.MODID
				+ "_enderfuge");
	}

	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged()) {
			config.save();
		}
	}

	public void registerItemRenderer(Item itemBlock, int i, String name) {
		// TODO Auto-generated method stub

	}
}
