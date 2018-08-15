package com.themastergeneral.enderfuge.common.items;

import net.minecraft.creativetab.CreativeTabs;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.enderfuge.Enderfuge;

public class BasicItem extends CTDItem {

	public BasicItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(Enderfuge.creativeTab);
	}

}
