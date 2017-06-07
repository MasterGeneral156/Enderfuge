package com.themastergeneral.enderfuge.proxy;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.client.gui.GUIHandler;
import com.themastergeneral.enderfuge.client.renders.BlockRenderRegister;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy 
{
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }
    @Override
    public void init(FMLInitializationEvent e) 
    {
        super.init(e);
        BlockRenderRegister.registerBlockRenderer();
    }
    @Override
    public void postInit(FMLPostInitializationEvent e) 
    {
        super.postInit(e);
    }
    public void registerItemRenderer(String mod,Item item, int meta, String id)
    {
    	 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("enderfuge" + ":" + id, "inventory"));
    }
}
