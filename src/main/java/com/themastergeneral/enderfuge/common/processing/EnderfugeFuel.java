package com.themastergeneral.enderfuge.common.processing;

import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Maps;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.config.Config;

public class EnderfugeFuel {
	private static final EnderfugeFuel SMELTING_BASE = new EnderfugeFuel();
	/** The list of fuel results. */
	private final Map<ItemStack, Integer> fuelList = Maps
			.<ItemStack, Integer> newHashMap();

	public static EnderfugeFuel instance() {
		return SMELTING_BASE;
	}

	// Add fuel here.
	private EnderfugeFuel() {
		this.addEnderfugeFuel(new ItemStack(Items.ENDER_EYE),
				Config.eyeFuelTime);
		this.addEnderfugeFuel(new ItemStack(Items.ENDER_PEARL),
				Config.pearlFuelTime);
		this.addEnderfugeFuel(new ItemStack(Items.END_CRYSTAL),
				Config.crystalFuelTime);
		this.addEnderfugeFuel(new ItemStack(Items.SHULKER_SHELL),
				Config.shulkerShellFuelTime);
		this.addEnderfugeFuel(new ItemStack(Blocks.DRAGON_EGG),
				Config.dragonEggFuelTime);
	}

	public void addEnderfugeFuel(ItemStack input, int burntime) {
		this.addFuel(input, burntime);
	}

	public void addFuel(ItemStack input, int burntime) {
		if (getFuelResult(input) != 0) {
			Enderfuge.logger
					.info("Ignored Enderfuge fuel with conflicting input: "
							+ input + ".");
			return;
		}
		this.fuelList.put(input, burntime);

	}

	public void removeFuel(ItemStack input) {
		if (getFuelResult(input) == 0) {
			Enderfuge.logger
					.error("Attempted to remove Enderfuge fuel that isn't registered: "
							+ input + ".");
			return;
		}
		this.fuelList.remove(input);
	}

	public Integer getFuelResult(ItemStack stack) {
		for (Entry<ItemStack, Integer> entry : this.fuelList.entrySet()) {
			if (this.compareItemStacks(stack, (ItemStack) entry.getKey())) {
				return entry.getValue();
			}
		}

		return 0;
	}

	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem()
				&& (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1
						.getMetadata());
	}

	public Map<ItemStack, Integer> getSmeltingList() {
		return this.fuelList;
	}
}