package com.themastergeneral.enderfuge.utils;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHelper {

	/* TODO: Move to CTD Core */
	public static ItemStack returnStackFromRegistryName(String name)
	{
		if (name.isEmpty())
		{
			return ItemStack.EMPTY;
		}
		return new ItemStack(Item.getByNameOrId(name));
	}
	
	public static Item returnItemFromRegistryName(String name)
	{
		Item returned = Item.getByNameOrId(name);
		if (returned == null)
		{
			return Item.getByNameOrId("minecraft:air");
		}
		else
			return returned;
	}
}
