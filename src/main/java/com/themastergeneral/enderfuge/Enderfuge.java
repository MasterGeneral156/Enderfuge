package com.themastergeneral.enderfuge;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.enderfuge.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Enderfuge.MODID, name = Enderfuge.MODNAME, version = Enderfuge.VERSION,
		acceptedMinecraftVersions = Enderfuge.acceptedMinecraftVersions, 
		updateJSON = Enderfuge.updateJSON, dependencies = Enderfuge.DEPENDENCIES)
public class Enderfuge 
{
	public static final String MODID = "enderfuge";
    public static final String MODNAME = "Enderfuge";
    public static final String VERSION = "1.1.8.1";
    public static final String acceptedMinecraftVersions = "1.12";
    public static final String DEPENDENCIES = "required-after:ctdcore@[1.1.3,];";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/Enderfuge.json";
    
    @Instance
    public static Enderfuge instance = new Enderfuge();
    
    //Logger
    public static Logger logger;
    
    @SidedProxy(clientSide="com.themastergeneral.enderfuge.proxy.ClientProxy", serverSide="com.themastergeneral.enderfuge.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.registerTileEntities();
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
