package com.themastergeneral.enderfuge.integration.ct;

import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

import crafttweaker.IAction;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;

public class AddEnderfugeSmelt implements IAction {

	private final IItemStack output;
	private final float experience;
	private final IItemStack input;
	
	public AddEnderfugeSmelt(IItemStack input, IItemStack output, float experience)
	{
		this.output = output;
		this.experience = experience;
		this.input = input;
	}
	@Override
	public void apply() {
		EnderfugeRecipes.instance().addSmeltingRecipe(CraftTweakerMC.getItemStack(this.input), CraftTweakerMC.getItemStack(this.output), experience);
	}

	@Override
	public String describe() {
		return "Adding Enderfuge Smelt: " + this.input + " smelts to " + this.output + ".";
	}

}
