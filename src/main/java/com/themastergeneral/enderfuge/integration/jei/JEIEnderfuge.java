package com.themastergeneral.enderfuge.integration.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.client.gui.GUIEnderfuge;
import com.themastergeneral.enderfuge.common.blocks.ModBlocks;
import com.themastergeneral.enderfuge.server.container.ContainerEnderfuge;

@JEIPlugin
public class JEIEnderfuge implements IModPlugin {
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		final IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		registry.addRecipeCategories(
				new EnderfugeFuelCategory(guiHelper),
				new EnderfugeSmeltingCategory(guiHelper)
		);
	}
	
	@Override
	public void register(IModRegistry registry)
	{
		final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		
		registry.addRecipes(EnderfugeSmeltingRecipeMaker.getFurnaceRecipes(jeiHelpers), "enderfuge.enderfuge");
		registry.addRecipes(EnderfugeFuelRecipeMaker.getEnderfugeFuelRecipes(ingredientRegistry, jeiHelpers), "enderfuge.fuel");
		
		registry.addRecipeClickArea(GUIEnderfuge.class, 78, 32, 28, 23, "enderfuge.enderfuge", "enderfuge.fuel");
		
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();
		
		recipeTransferRegistry.addRecipeTransferHandler(ContainerEnderfuge.class, "enderfuge.enderfuge", 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerEnderfuge.class, "enderfuge.fuel", 1, 1, 3, 36);
		
		registry.addRecipeCatalyst(new ItemStack(ModBlocks.enderfuge), "enderfuge.enderfuge", "enderfuge.fuel");
	}
}
