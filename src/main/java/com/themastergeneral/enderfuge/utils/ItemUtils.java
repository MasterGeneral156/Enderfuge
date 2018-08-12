package com.themastergeneral.enderfuge.utils;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemUtils {

	//TODO: Move to CTDCore...
	public static Item itemFromRegistryName(String name) {
		return Item.REGISTRY.getObject(new ResourceLocation(name));
	}
}
