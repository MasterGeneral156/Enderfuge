package com.themastergeneral.enderfuge.common.blocks;

import com.themastergeneral.enderfuge.client.renders.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static BlockEnderfuge enderfuge = new BlockEnderfuge("enderfuge", false);
	public static BlockEnderfuge enderfuge_active = new BlockEnderfuge("enderfuge_active", true);
	public static void registerBlocks()
	{
		enderfuge = register(new BlockEnderfuge("enderfuge", false));
		enderfuge_active = register(new BlockEnderfuge("enderfuge_active", true));
	}
	public static <T extends Block> T register (T block, ItemBlock itemBlock) 
	 {
		 GameRegistry.register(block);
		 if(itemBlock != null) 
		 {
			 GameRegistry.register(itemBlock);
		 }
		 if(block instanceof ItemModelProvider) 
		 {
			 ((ItemModelProvider)block).registerItemModel(itemBlock);
		 }
		 return block;
	 }
	public static <T extends Block> T register(T block) 
	 {
		 ItemBlock itemBlock = new ItemBlock(block);
		 itemBlock.setRegistryName(block.getRegistryName());
		 return register(block, itemBlock);
	 }
}
