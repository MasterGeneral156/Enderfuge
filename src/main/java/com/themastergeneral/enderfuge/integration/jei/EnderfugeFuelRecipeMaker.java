package com.themastergeneral.enderfuge.integration.jei;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;
import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;

public final class EnderfugeFuelRecipeMaker {

	private EnderfugeFuelRecipeMaker() {
	}

	public static List<EnderfugeFuelRecipe> getEnderfugeFuelRecipes(IIngredientRegistry ingredientRegistry, IJeiHelpers helpers) {
		IStackHelper stackHelper = helpers.getStackHelper();
		IGuiHelper guiHelper = helpers.getGuiHelper();
		EnderfugeFuel furnaceRecipes = EnderfugeFuel.instance();
		Map<ItemStack, Integer> smeltingMap = furnaceRecipes.getSmeltingList();

		List<EnderfugeFuelRecipe> recipes = new ArrayList<>();

		for (Map.Entry<ItemStack, Integer> entry : smeltingMap.entrySet()) {
			ItemStack input = entry.getKey();
			Integer output = entry.getValue();

			List<ItemStack> inputs = stackHelper.getSubtypes(input);
			EnderfugeFuelRecipe recipe = new EnderfugeFuelRecipe(guiHelper, inputs, output);
			recipes.add(recipe);
		}

		return recipes;
	}

	private static void removeNoBurnTime(Collection<ItemStack> itemStacks) {
		itemStacks.removeIf(itemStack -> getBurnTime(itemStack) == 0);
	}

	private static int getBurnTime(ItemStack itemStack) {
		return TEEnderfuge.getItemBurnTime(itemStack);
	}
}
