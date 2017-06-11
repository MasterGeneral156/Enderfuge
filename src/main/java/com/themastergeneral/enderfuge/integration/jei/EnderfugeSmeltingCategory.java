package com.themastergeneral.enderfuge.integration.jei;

import java.util.List;

import com.themastergeneral.enderfuge.Enderfuge;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EnderfugeSmeltingCategory extends EnderfugeRecipeCategory<EnderfugeSmeltingRecipe> {
	private final IDrawable background;
	private final String localizedName;

	public EnderfugeSmeltingCategory(IGuiHelper guiHelper) {
		super(guiHelper);
		ResourceLocation location = new ResourceLocation("minecraft", "textures/gui/container/furnace.png");
		background = guiHelper.createDrawable(location, 55, 16, 82, 54);
		localizedName = "Enderfuge";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void drawExtras(Minecraft minecraft) {
		flame.draw(minecraft, 2, 20);
		arrow.draw(minecraft, 24, 18);
	}

	@Override
	public String getTitle() {
		return localizedName;
	}

	@Override
	public String getUid() {
		return "enderfuge:enderfuge";
	}

	public void setRecipe(IRecipeLayout recipeLayout, EnderfugeSmeltingRecipe recipeWrapper) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(inputSlot, true, 0, 0);
		guiItemStacks.init(outputSlot, false, 60, 18);

		List<List<ItemStack>> inputs = recipeWrapper.getInputs();
		guiItemStacks.set(inputSlot, inputs.get(0));
		List<ItemStack> outputs = recipeWrapper.getOutputs();
		guiItemStacks.set(outputSlot, outputs.get(0));
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, EnderfugeSmeltingRecipe recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(inputSlot, true, 0, 0);
		guiItemStacks.init(outputSlot, false, 60, 18);

		guiItemStacks.set(ingredients);
	}

	@Override
	public String getModName() 
	{
		return Enderfuge.MODNAME;
	}
}
