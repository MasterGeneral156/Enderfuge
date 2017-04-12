package com.themastergeneral.enderfuge.integration.jei;

import java.awt.Color;
import java.util.Collections;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

public class EnderfugeSmeltingRecipe extends BlankRecipeWrapper  {
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

	public List<List<ItemStack>> getInputs() {
		return inputs;
	}

	public List<ItemStack> getOutputs() {
		return Collections.singletonList(output);
	}

	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
		EnderfugeRecipes furnaceRecipes = EnderfugeRecipes.instance();
		float experience = furnaceRecipes.getSmeltingExperience(output);
		if (experience > 0) {
			String experienceString = "XP 0.7";
			FontRenderer fontRendererObj = minecraft.fontRendererObj;
			int stringWidth = fontRendererObj.getStringWidth(experienceString);
			fontRendererObj.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
		}
	}
}
