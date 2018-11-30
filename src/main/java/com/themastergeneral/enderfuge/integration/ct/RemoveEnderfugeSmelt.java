package com.themastergeneral.enderfuge.integration.ct;

import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class RemoveEnderfugeSmelt implements IAction {

	private final IItemStack output;
	private final IItemStack input;
	
	public RemoveEnderfugeSmelt(IItemStack input, IItemStack output)
	{
		this.output = output;
		this.input = input;
	}
	@Override
	public void apply() {
		EnderfugeRecipes.instance().removeSmelting(CraftTweakerMC.getItemStack(this.input), CraftTweakerMC.getItemStack(this.output));
	}

	@Override
	public String describe() {
		return "Removing Enderfuge Smelt: " + this.input + " smelts to " + this.output + ".";
	}

}
