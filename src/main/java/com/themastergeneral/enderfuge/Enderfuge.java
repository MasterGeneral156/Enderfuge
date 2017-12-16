package com.themastergeneral.enderfuge;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.enderfuge.proxy.CommonProxy;
import com.themastergeneral.enderfuge.utils.IMCHandler;

@Mod(modid = Enderfuge.MODID, name = Enderfuge.MODNAME, certificateFingerprint = Enderfuge.Fingerprint, version = Enderfuge.VERSION, acceptedMinecraftVersions = Enderfuge.acceptedMinecraftVersions, updateJSON = Enderfuge.updateJSON, dependencies = Enderfuge.DEPENDENCIES)
public class Enderfuge {
	public static final String MODID = "enderfuge";
	public static final String MODNAME = "Enderfuge";
	public static final String VERSION = "1.4.3";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2,];";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/Enderfuge.json";
	public static final String Fingerprint = "441b509a0f58a0ef41aca8daf1be20d96287635e";

	@Instance
	public static Enderfuge instance = new Enderfuge();

	// Logger
	public static Logger logger;

	@SidedProxy(clientSide = "com.themastergeneral.enderfuge.proxy.ClientProxy", serverSide = "com.themastergeneral.enderfuge.proxy.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Enderfuge is loading...");
		proxy.registerTileEntities();
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for Enderfuge! TheMasterGeneral will not support this version!");
	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent e) {
		IMCHandler.INSTANCE.handleIMC(FMLInterModComms
				.fetchRuntimeMessages(this));
		logger.info("Enderfuge has loaded completely.");
	}

	@EventHandler
	public void handleIMC(IMCEvent e) {
		IMCHandler.INSTANCE.handleIMC(e.getMessages());
	}

}
