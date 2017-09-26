package com.themastergeneral.enderfuge.integration.jei;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.client.gui.GUIEnderfuge;
import com.themastergeneral.enderfuge.common.blocks.ModBlocks;

@JEIPlugin
public class JEIEnderfuge extends BlankModPlugin {
	@Override
	public void register(IModRegistry registry) {
		IIngredientRegistry ingredientRegistry = registry
				.getIngredientRegistry();
		IJeiHelpers jeiHelpers = registry.getJeiHelpers();

		IGuiHelper guiHelper = jeiHelpers.getGuiHelper();
		registry.addRecipeCategories(new EnderfugeSmeltingCategory(guiHelper));

		registry.addRecipeHandlers(new EnderfugeSmeltingHandler());
		registry.addRecipeClickArea(GUIEnderfuge.class, 78, 32, 28, 23,
				"enderfuge:enderfuge");

		registry.addRecipeCategoryCraftingItem(new ItemStack(
				ModBlocks.enderfuge), "enderfuge:enderfuge");

		registry.addRecipes(EnderfugeSmeltingRecipeMaker
				.getFurnaceRecipes(jeiHelpers));

		registry.addDescription(new ItemStack(Items.ENDER_PEARL),
				"enderfuge.fuel.enderpearl");
		registry.addDescription(new ItemStack(Items.ENDER_EYE),
				"enderfuge.fuel.eyeofender");
		registry.addDescription(new ItemStack(Items.END_CRYSTAL),
				"enderfuge.fuel.endcrystal");
		registry.addDescription(new ItemStack(ModBlocks.enderfuge),
				"enderfuge.fuel.enderfuge");
	}
}
