package com.themastergeneral.enderfuge.integration.ct;

import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class AddEnderfugeFuel implements IAction {

	private final IItemStack output;
	private final int ticks;
	
	public AddEnderfugeFuel(IItemStack output, int ticks)
	{
		this.output = output;
		this.ticks = ticks;
	}
	@Override
	public void apply() {
		EnderfugeFuel.instance().addFuel(CraftTweakerMC.getItemStack(this.output), ticks);
	}

	@Override
	public String describe() {
		return "Adding Enderfuge Fuel:" + this.output + " for " + ticks + " ticks.";
	}

}
