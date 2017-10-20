package com.themastergeneral.enderfuge.integration.jei;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.google.common.base.Preconditions;
import com.themastergeneral.enderfuge.common.config.Config;

public class EnderfugeFuelRecipe implements IRecipeWrapper {
	private final List<List<ItemStack>> inputs;
	private final String smeltCountString;
	private final String burnTimeString;
	private final IDrawableAnimated flame;
	ResourceLocation backgroundLocation = new ResourceLocation("jei", "textures/gui/gui_vanilla.png");

	public EnderfugeFuelRecipe(IGuiHelper guiHelper, Collection<ItemStack> input, int burnTime) {
		Preconditions.checkArgument(burnTime > 0, " " + input + "'s burn time needs to be greater than 0.");
		List<ItemStack> inputList = new ArrayList<>(input);
		this.inputs = Collections.singletonList(inputList);

		if (burnTime == Config.smeltTime) {
			this.smeltCountString = "Smelts 1 Item";
		} else {
			NumberFormat numberInstance = NumberFormat.getNumberInstance();
			numberInstance.setMaximumFractionDigits(2);
			String smeltCount = numberInstance.format(burnTime / (float) Config.smeltTime);
			this.smeltCountString = "Smelts " + smeltCount + " items." ;
		}

		this.burnTimeString = "Burns for " + burnTime + " ticks.";

		IDrawableStatic flameDrawable = guiHelper.createDrawable(backgroundLocation, 82, 114, 14, 14);
		this.flame = guiHelper.createAnimatedDrawable(flameDrawable, burnTime, IDrawableAnimated.StartDirection.TOP, true);
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputLists(ItemStack.class, inputs);
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
		flame.draw(minecraft, 1, 0);
		minecraft.fontRenderer.drawString(smeltCountString, 24, 8, Color.gray.getRGB());
		minecraft.fontRenderer.drawString(burnTimeString, 24, 18, Color.gray.getRGB());
	}
}
