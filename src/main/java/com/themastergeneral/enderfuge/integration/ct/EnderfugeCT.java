package com.themastergeneral.enderfuge.integration.ct;

import crafttweaker.CraftTweakerAPI;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.Optional;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.enderfuge")
@ZenRegister

public class EnderfugeCT {

	@ZenMethod
	public static void addEnderfugeFuel(IItemStack output, int ticks) {
		CraftTweakerAPI.apply(new AddEnderfugeFuel(output, ticks));
	}
	
	@ZenMethod
	public static void removeEnderfugeFuel(IItemStack output) {
		CraftTweakerAPI.apply(new RemoveEnderfugeFuel(output));
	}
	
	@ZenMethod
	public static void addEnderfugeSmelt(IItemStack input, IItemStack output, @Optional float experience) {
		CraftTweakerAPI.apply(new AddEnderfugeSmelt(input, output, experience));
	}
	
	@ZenMethod
	public static void removeEnderfugeSmelt(IItemStack input, IItemStack output) {
		CraftTweakerAPI.apply(new RemoveEnderfugeSmelt(input, output));
	}
}
