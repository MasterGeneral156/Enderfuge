package com.themastergeneral.enderfuge.integration.jei;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;

import com.themastergeneral.enderfuge.Enderfuge;

public class EnderfugeFuelCategory extends EnderfugeRecipeCategory<EnderfugeFuelRecipe> {
	private final IDrawableStatic background;
	private final IDrawableStatic flameTransparentBackground;
	private final String localizedName;
	ResourceLocation backgroundLocation = new ResourceLocation("jei", "textures/gui/gui_vanilla.png");
	ResourceLocation icon = new ResourceLocation("jei", "textures/gui/recipe_background.png");

	public EnderfugeFuelCategory(IGuiHelper guiHelper) {
		super(guiHelper);
		background = guiHelper.createDrawable(backgroundLocation, 0, 134, 18, 34, 0, 0, 0, 80);

		flameTransparentBackground = guiHelper.createDrawable(icon, 215, 0, 14, 14);
		localizedName = "Enderfuge Fuel";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public String getUid() {
		return "enderfuge.fuel";
	}

	@Override
	public String getTitle() {
		return localizedName;
	}

	@Override
	public String getModName() {
		return Enderfuge.MODNAME;
	}

	@Nullable
	@Override
	public IDrawable getIcon() {
		return flameTransparentBackground;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, EnderfugeFuelRecipe recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

		guiItemStacks.init(fuelSlot, true, 0, 16);
		guiItemStacks.set(ingredients);
	}
}