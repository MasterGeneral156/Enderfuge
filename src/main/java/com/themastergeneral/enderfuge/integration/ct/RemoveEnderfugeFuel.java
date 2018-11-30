package com.themastergeneral.enderfuge.integration.ct;

import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class RemoveEnderfugeFuel implements IAction {

	private final IItemStack output;
	
	public RemoveEnderfugeFuel(IItemStack output)
	{
		this.output = output;
	}
	@Override
	public void apply() {
		EnderfugeFuel.instance().removeFuel(CraftTweakerMC.getItemStack(this.output));
	}

	@Override
	public String describe() {
		return "Removing Enderfuge Fuel:" + this.output + ".";
	}

}