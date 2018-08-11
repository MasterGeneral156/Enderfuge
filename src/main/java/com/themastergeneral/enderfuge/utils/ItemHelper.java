package com.themastergeneral.enderfuge.utils;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHelper {

	/* TODO: Move to CTD Core */
	public static ItemStack returnStackFromRegistryName(String name)
	{
		if (Item.REGISTRY.getObject(new ResourceLocation(name)) == null)
			return ItemStack.EMPTY;
		else
			return new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(name)));
	}
	
	public static Item returnItemFromRegistryName(String name)
	{
		//return Item.REGISTRY.getObject(new ResourceLocation(name));
		if (Item.REGISTRY.containsKey(new ResourceLocation(name)))
		{
			return Item.REGISTRY.getObject(new ResourceLocation(name));
		}
		return null;
		
	}
}
