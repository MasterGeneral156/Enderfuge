package com.themastergeneral.enderfuge.common.blocks;

import com.themastergeneral.ctdcore.block.RegisterBlock;

public class ModBlocks extends RegisterBlock {
	public static BlockEnderfuge enderfuge = new BlockEnderfuge("enderfuge",
			false);
	public static BlockEnderfuge enderfuge_active = new BlockEnderfuge(
			"enderfuge_active", true);

	public static void registerBlocks() {
		enderfuge = register(new BlockEnderfuge("enderfuge", false));
		enderfuge_active = register(new BlockEnderfuge("enderfuge_active", true));
	}
}
