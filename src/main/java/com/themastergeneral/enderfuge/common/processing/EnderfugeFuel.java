package com.themastergeneral.enderfuge.common.processing;

import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Maps;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.config.Config;

public class EnderfugeFuel {
	private static final EnderfugeFuel SMELTING_BASE = new EnderfugeFuel();
	/** The list of fuel results. */
	private final static Map<ItemStack, Integer> fuelList = Maps.<ItemStack, Integer> newHashMap();
	
	public static EnderfugeFuel instance() {
		return SMELTING_BASE;
	}
	//Add fuel here.
	private EnderfugeFuel() {
		this.addEnderfugeFuel(Items.ENDER_EYE, Config.eyeFuelTime);
		this.addEnderfugeFuel(Items.ENDER_PEARL, Config.pearlFuelTime);
		this.addEnderfugeFuel(Items.END_CRYSTAL, Config.crystalFuelTime);
	}
	
	public void addEnderfugeFuel(Item input, int burntime) {
		this.addFuel(new ItemStack(input, 1, 32767), burntime);
	}

	public static void addFuel(ItemStack input, int burntime) {
		if (getFuelResult(input) != 0) {
			Enderfuge.logger
					.info("Ignored Enderfuge fuel with conflicting input: "
							+ input + ".");
			return;
		}
		fuelList.put(input, burntime);

	}

	public static Integer getFuelResult(ItemStack stack) {
		for (Entry<ItemStack, Integer> entry : fuelList.entrySet()) {
			if (compareItemStacks(stack, (ItemStack) entry.getKey())) {
				return entry.getValue();
			}
		}

		return 0;
	}

	private static boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem()
				&& (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1
						.getMetadata());
	}

	public Map<ItemStack, Integer> getSmeltingList() {
		return this.fuelList;
	}
}
