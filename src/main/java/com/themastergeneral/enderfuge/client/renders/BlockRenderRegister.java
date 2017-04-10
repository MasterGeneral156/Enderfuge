package com.themastergeneral.enderfuge.client.renders;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister 
{
	public static String modid = Enderfuge.MODID;
    public static void registerBlockRenderer() 
    {
    	reg(ModBlocks.enderfuge);
    }
    public static void reg(Block block) 
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}