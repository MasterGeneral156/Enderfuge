package com.themastergeneral.enderfuge.integration.jei;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class EnderfugeSmeltingHandler implements
		IRecipeHandler<EnderfugeSmeltingRecipe> {

	@Override
	public Class<EnderfugeSmeltingRecipe> getRecipeClass() {
		return EnderfugeSmeltingRecipe.class;
	}

	public String getRecipeCategoryUid() {
		return "enderfuge:enderfuge";
	}

	@Override
	public String getRecipeCategoryUid(EnderfugeSmeltingRecipe recipe) {
		return "enderfuge:enderfuge";
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(EnderfugeSmeltingRecipe recipe) {
		return recipe;
	}

	@Override
	public boolean isRecipeValid(EnderfugeSmeltingRecipe recipe) {
		return true;
	}

}
