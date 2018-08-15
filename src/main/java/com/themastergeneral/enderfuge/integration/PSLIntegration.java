package com.themastergeneral.enderfuge.integration;

import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.helpers.StackHelper;

public class PSLIntegration {

	public static void load()
	{
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("pumpkinspice:latte")), 1420);
	}
}
