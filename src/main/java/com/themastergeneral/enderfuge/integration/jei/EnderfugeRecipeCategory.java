package com.themastergeneral.enderfuge.integration.jei;

import net.minecraft.util.ResourceLocation;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;

import com.themastergeneral.enderfuge.common.config.Config;

public abstract class EnderfugeRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T> {
	protected static final int inputSlot = 0;
	protected static final int fuelSlot = 1;
	protected static final int outputSlot = 2;

	protected final IDrawableStatic staticFlame;
	protected final IDrawableAnimated animatedFlame;
	protected final IDrawableAnimated arrow;

	public EnderfugeRecipeCategory(IGuiHelper guiHelper) {
		ResourceLocation backgroundLocation = new ResourceLocation("jei", "textures/gui/gui_vanilla.png");
		
		staticFlame = guiHelper.createDrawable(backgroundLocation, 82, 114, 14, 14);
		animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

		IDrawableStatic arrowDrawable = guiHelper.createDrawable(backgroundLocation, 82, 128, 24, 17);
		this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, Config.smeltTime, IDrawableAnimated.StartDirection.LEFT, false);
	}
}
