package com.themastergeneral.enderfuge.integration.jei;

import java.awt.Color;
import java.util.Collections;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

public class EnderfugeSmeltingRecipe implements IRecipeWrapper {
	private final List<List<ItemStack>> inputs;
	private final ItemStack output;

	public EnderfugeSmeltingRecipe(List<ItemStack> inputs, ItemStack output) {
		this.inputs = Collections.singletonList(inputs);
		this.output = output;
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInputLists(ItemStack.class, inputs);
		ingredients.setOutput(ItemStack.class, output);
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
		EnderfugeRecipes furnaceRecipes = EnderfugeRecipes.instance();
		float experience = furnaceRecipes.getSmeltingExperience(output);
		if (experience > 0) {
			String experienceString = "XP:" + experience;
			FontRenderer fontRenderer = minecraft.fontRenderer;
			int stringWidth = fontRenderer.getStringWidth(experienceString);
			fontRenderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
		}
	}
}
