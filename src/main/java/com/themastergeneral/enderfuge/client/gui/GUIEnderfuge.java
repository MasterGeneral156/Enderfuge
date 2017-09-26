package com.themastergeneral.enderfuge.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;
import com.themastergeneral.enderfuge.server.container.ContainerEnderfuge;

public class GUIEnderfuge extends GuiContainer {
	private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation(
			"textures/gui/container/furnace.png");
	/** The player inventory bound to this GUI. */
	private final InventoryPlayer playerInventory;
	private final IInventory tileFurnace;

	public GUIEnderfuge(InventoryPlayer playerInv, IInventory furnaceInv) {
		super(new ContainerEnderfuge(playerInv, furnaceInv));
		this.playerInventory = playerInv;
		this.tileFurnace = furnaceInv;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of
	 * the items)
	 */
	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		// I seriously have no idea why it crashes, or shows a shadow under the
		// text.
		// String s = "container.enderfuge".;
		// drawString(fontRenderer, s, this.xSize / 2 -
		// this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
		// drawString(fontRenderer,
		// this.playerInventory.getDisplayName().getUnformattedText(), 8,
		// this.ySize - 96 + 2, 4210752);
	}

	/**
	 * Draws the background layer of this container (behind the items).
	 */
	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX,
			int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(FURNACE_GUI_TEXTURES);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

		if (TEEnderfuge.isBurning(this.tileFurnace)) {
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k,
					14, k + 1);
		}

		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
	}

	private int getCookProgressScaled(int pixels) {
		int i = this.tileFurnace.getField(2);
		int j = this.tileFurnace.getField(3);
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}

	private int getBurnLeftScaled(int pixels) {
		int i = this.tileFurnace.getField(1);

		if (i == 0) {
			i = 200;
		}

		return this.tileFurnace.getField(0) * pixels / i;
	}

	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
}
