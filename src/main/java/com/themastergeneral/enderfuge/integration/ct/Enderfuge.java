package com.themastergeneral.enderfuge.integration.ct;

import javax.annotation.Nullable;

import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

//Hey More Tweakers! Didn't realize you guys
//already had CT with us! Didn't mean to intrude
//much love guys < 3 -TMG

@ZenClass("mods.enderfuge")
@ZenRegister
public class Enderfuge 
{
	@ZenMethod
    public static void addRecipe(IItemStack input, IItemStack output, @Nullable float xp) 
	{
		EnderfugeRecipes.instance().addSmeltingRecipe(CraftTweakerMC.getItemStack(input), CraftTweakerMC.getItemStack(output), xp);
	}
	
	@ZenMethod
    public static void removeRecipe(IItemStack input, IItemStack output) 
	{
		EnderfugeRecipes.instance().removeSmelting(CraftTweakerMC.getItemStack(input), CraftTweakerMC.getItemStack(output));
	}
	
	@ZenMethod
    public static void addFuel(IItemStack input, int ticks) 
	{
		EnderfugeFuel.instance().addEnderfugeFuel(CraftTweakerMC.getItemStack(input), ticks);
	}
	
	@ZenMethod
    public static void removeFuel(IItemStack input) 
	{
		EnderfugeFuel.instance().removeFuel(CraftTweakerMC.getItemStack(input));
	}
	
}
