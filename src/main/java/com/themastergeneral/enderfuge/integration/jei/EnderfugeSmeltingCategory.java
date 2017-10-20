package com.themastergeneral.enderfuge.integration.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import com.themastergeneral.enderfuge.Enderfuge;

public class EnderfugeSmeltingCategory extends EnderfugeRecipeCategory<EnderfugeSmeltingRecipe> {
	private final IDrawable background;
	private final String localizedName;
	ResourceLocation backgroundLocation = new ResourceLocation("jei", "textures/gui/gui_vanilla.png");

	public EnderfugeSmeltingCategory(IGuiHelper guiHelper) {
		super(guiHelper);
		background = guiHelper.createDrawable(backgroundLocation, 0, 114, 82, 54);
		localizedName = "Enderfuge";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void drawExtras(Minecraft minecraft) {
		animatedFlame.draw(minecraft, 1, 20);
		arrow.draw(minecraft, 24, 18);
	}

	@Override
	public String getTitle() {
		return localizedName;
	}

	@Override
	public String getModName() {
		return Enderfuge.MODNAME;
	}

	@Override
	public String getUid() {
		return "enderfuge.enderfuge";
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, EnderfugeSmeltingRecipe recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(inputSlot, true, 0, 0);
		guiItemStacks.init(outputSlot, false, 60, 18);

		guiItemStacks.set(ingredients);
	}
}