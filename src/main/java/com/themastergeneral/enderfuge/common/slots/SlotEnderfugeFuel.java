package com.themastergeneral.enderfuge.common.slots;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.themastergeneral.enderfuge.common.tileentity.TEEnderfuge;

public class SlotEnderfugeFuel extends Slot {
	public SlotEnderfugeFuel(IInventory inventoryIn, int slotIndex,
			int xPosition, int yPosition) {
		super(inventoryIn, slotIndex, xPosition, yPosition);
	}

	/**
	 * Check if the stack is allowed to be placed in this slot, used for armor
	 * slots as well as furnace fuel.
	 */
	public boolean isItemValid(ItemStack stack) {
		return TEEnderfuge.isItemFuel(stack);
	}

	public int getItemStackLimit(ItemStack stack) {
		return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
	}

	public static boolean isBucket(ItemStack stack) {
		return stack.getItem() == Items.BUCKET;
	}
}
