package com.themastergeneral.enderfuge.integration.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

public final class EnderfugeSmeltingRecipeMaker {

	private EnderfugeSmeltingRecipeMaker() {
	}

	public static List<EnderfugeSmeltingRecipe> getFurnaceRecipes(IJeiHelpers helpers) {
		IStackHelper stackHelper = helpers.getStackHelper();
		EnderfugeRecipes furnaceRecipes = EnderfugeRecipes.instance();
		Map<ItemStack, ItemStack> smeltingMap = furnaceRecipes.getSmeltingList();

		List<EnderfugeSmeltingRecipe> recipes = new ArrayList<>();

		for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet()) {
			ItemStack input = entry.getKey();
			ItemStack output = entry.getValue();

			List<ItemStack> inputs = stackHelper.getSubtypes(input);
			EnderfugeSmeltingRecipe recipe = new EnderfugeSmeltingRecipe(inputs, output);
			recipes.add(recipe);
		}

		return recipes;
	}

}
