package com.themastergeneral.enderfuge.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;
import com.themastergeneral.enderfuge.server.container.ContainerEnderfuge;

public class GUIHandler implements IGuiHandler {
	public static final int ENDERFUGE = 0;

	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player,
			World world, int x, int y, int z) {
		if (ID == ENDERFUGE) {
			return new ContainerEnderfuge(player.inventory,
					(TEEnderfuge) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public GuiScreen getClientGuiElement(int ID, EntityPlayer player,
			World world, int x, int y, int z) {
		if (ID == ENDERFUGE) {
			return new GUIEnderfuge(player.inventory,
					(TEEnderfuge) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}
