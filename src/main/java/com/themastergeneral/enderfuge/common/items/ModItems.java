package com.themastergeneral.enderfuge.common.items;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.blocks.BlockEnderfuge;

public class ModItems extends RegisterItem {
	public static BasicItem nuggetdiamond;

	public static void registerBlocks() {
		nuggetdiamond = register(new BasicItem("nuggetdiamond", Enderfuge.MODID));
	}
}
