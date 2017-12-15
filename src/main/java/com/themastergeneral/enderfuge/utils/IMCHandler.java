package com.themastergeneral.enderfuge.utils;

import java.util.List;
import java.util.Locale;

import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.processing.EnderfugeFuel;
import com.themastergeneral.enderfuge.common.processing.EnderfugeRecipes;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;

public class IMCHandler {
	public static final IMCHandler INSTANCE = new IMCHandler();

	public void handleIMC(List<IMCMessage> messages) {

		NBTTagCompound nbt;
		for (IMCMessage message : messages) {
			try {
				if (!message.isNBTMessage()) {
					continue;
				}
				nbt = message.getNBTValue();
				String operation = message.key.toLowerCase(Locale.US);

				switch (operation) {
				case ADD_ENDERFUGE_RECIPE:
					if (nbt.hasKey(XP)) {
						EnderfugeRecipes.instance().addSmeltingRecipe(
								new ItemStack(nbt.getCompoundTag(INPUT)),
								new ItemStack(nbt.getCompoundTag(OUTPUT)),
								nbt.getFloat(XP));
					} else {
						EnderfugeRecipes.instance().addSmeltingRecipe(
								new ItemStack(nbt.getCompoundTag(INPUT)),
								new ItemStack(nbt.getCompoundTag(OUTPUT)), 0);
					}
					continue;
				case "ADD_ENDERFUGE_FUEL":
					EnderfugeFuel.instance().addFuel(
							new ItemStack(nbt.getCompoundTag(INPUT)),
							nbt.getInteger(BURNTIME));
					continue;
				}
				Enderfuge.logger.warn("Enderfuge received an invalid IMC from "
						+ message.getSender() + "! Key was " + message.key);
			} catch (Exception e) {
				Enderfuge.logger.warn("Enderfuge received a broken IMC from "
						+ message.getSender() + "!");
				e.printStackTrace();
			}
		}
	}

	/*
	 * IMC Strings
	 */
	static final String INPUT = "input";
	static final String XP = "xp";
	static final String OUTPUT = "output";
	static final String BURNTIME = "burn";
	
	public static final String ADD_ENDERFUGE_RECIPE = "addenderfugerecipe";
}
