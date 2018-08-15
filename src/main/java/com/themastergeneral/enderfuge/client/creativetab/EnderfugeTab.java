package com.themastergeneral.enderfuge.client.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.items.ModItems;

public class EnderfugeTab extends CreativeTabs {
	public EnderfugeTab() {
		super(Enderfuge.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.enderfuge_logo);
	}

	@Override
	public boolean hasSearchBar() {
		return false;
	}
}
