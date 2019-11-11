package com.themastergeneral.enderfuge.integration;

import com.themastergeneral.ctdcore.helpers.StackHelper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TFIntegration {
	public static void loadTF() {
		invar();
		copper();
		tin();
		platinum();
		silver();
		lead();
		aluminum();
		steel();
		nickel();
		electrum();
		bronze();
		constantan();
		fuel();
	}

	public static void invar() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_invar", "thermalfoundation:material", 18, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_invar", "thermalfoundation:material", 18, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_invar", "thermalfoundation:material", 13, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_invar", "thermalfoundation:material", 13, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_invar", "thermalfoundation:material", 4, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_invar", "thermalfoundation:material", 40, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_invar", "thermalfoundation:material", 27, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_invar", "thermalfoundation:material", 36, 226, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_invar", "thermalfoundation:material", 22, 226, 0.7F);
	}

	public static void copper() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_copper", "thermalfoundation:material", 18, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_copper", "thermalfoundation:material", 18, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_copper", "thermalfoundation:material", 13, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_copper", "thermalfoundation:material", 13, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_copper", "thermalfoundation:material", 4, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_copper", "thermalfoundation:material", 40, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_copper", "thermalfoundation:material", 27, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_copper", "thermalfoundation:material", 36, 192, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_copper", "thermalfoundation:material", 22, 192, 0.7F);
	}

	public static void tin() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_tin", "thermalfoundation:material", 18, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_tin", "thermalfoundation:material", 18, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_tin", "thermalfoundation:material", 13, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_tin", "thermalfoundation:material", 13, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_tin", "thermalfoundation:material", 4, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_tin", "thermalfoundation:material", 40, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_tin", "thermalfoundation:material", 27, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_tin", "thermalfoundation:material", 36, 193, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_tin", "thermalfoundation:material", 22, 193, 0.7F);
	}

	public static void platinum() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_platinum", "thermalfoundation:material", 18, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_platinum", "thermalfoundation:material", 18, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_platinum", "thermalfoundation:material", 13, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_platinum", "thermalfoundation:material", 13, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_platinum", "thermalfoundation:material", 4, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_platinum", "thermalfoundation:material", 40, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_platinum", "thermalfoundation:material", 27, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_platinum", "thermalfoundation:material", 36, 198, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_platinum", "thermalfoundation:material", 22, 198, 0.7F);
	}

	public static void silver() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_silver", "thermalfoundation:material", 18, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_silver", "thermalfoundation:material", 18, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_silver", "thermalfoundation:material", 13, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_silver", "thermalfoundation:material", 13, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_silver", "thermalfoundation:material", 4, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_silver", "thermalfoundation:material", 40, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_silver", "thermalfoundation:material", 27, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_silver", "thermalfoundation:material", 36, 194, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_silver", "thermalfoundation:material", 22, 194, 0.7F);
	}

	public static void lead() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_lead", "thermalfoundation:material", 18, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_lead", "thermalfoundation:material", 18, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_lead", "thermalfoundation:material", 13, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_lead", "thermalfoundation:material", 13, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_lead", "thermalfoundation:material", 4, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_lead", "thermalfoundation:material", 40, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_lead", "thermalfoundation:material", 27, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_lead", "thermalfoundation:material", 36, 195, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_lead", "thermalfoundation:material", 22, 195, 0.7F);
	}

	public static void aluminum() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_aluminum", "thermalfoundation:material", 18, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_aluminum", "thermalfoundation:material", 18, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_aluminum", "thermalfoundation:material", 13, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_aluminum", "thermalfoundation:material", 13, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_aluminum", "thermalfoundation:material", 4, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_aluminum", "thermalfoundation:material", 40, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_aluminum", "thermalfoundation:material", 27, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_aluminum", "thermalfoundation:material", 36, 196, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_aluminum", "thermalfoundation:material", 22, 196, 0.7F);
	}

	public static void steel() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_steel", "thermalfoundation:material", 18, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_steel", "thermalfoundation:material", 18, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_steel", "thermalfoundation:material", 13, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_steel", "thermalfoundation:material", 13, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_steel", "thermalfoundation:material", 4, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_steel", "thermalfoundation:material", 40, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_steel", "thermalfoundation:material", 27, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_steel", "thermalfoundation:material", 36, 224, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_steel", "thermalfoundation:material", 22, 224, 0.7F);
	}

	public static void nickel() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_nickel", "thermalfoundation:material", 18, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_nickel", "thermalfoundation:material", 18, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_nickel", "thermalfoundation:material", 13, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_nickel", "thermalfoundation:material", 13, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_nickel", "thermalfoundation:material", 4, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_nickel", "thermalfoundation:material", 40, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_nickel", "thermalfoundation:material", 27, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_nickel", "thermalfoundation:material", 36, 197, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_nickel", "thermalfoundation:material", 22, 197, 0.7F);
	}

	public static void electrum() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_electrum", "thermalfoundation:material", 18, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_electrum", "thermalfoundation:material", 18, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_electrum", "thermalfoundation:material", 13, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_electrum", "thermalfoundation:material", 13, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_electrum", "thermalfoundation:material", 4, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_electrum", "thermalfoundation:material", 40, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_electrum", "thermalfoundation:material", 27, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_electrum", "thermalfoundation:material", 36, 225, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_electrum", "thermalfoundation:material", 22, 225, 0.7F);
	}

	public static void bronze() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_bronze", "thermalfoundation:material", 18, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_bronze", "thermalfoundation:material", 18, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_bronze", "thermalfoundation:material", 13, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_bronze", "thermalfoundation:material", 13, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_bronze", "thermalfoundation:material", 4, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_bronze", "thermalfoundation:material", 40, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_bronze", "thermalfoundation:material", 27, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_bronze", "thermalfoundation:material", 36, 227, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_bronze", "thermalfoundation:material", 22, 227, 0.7F);
	}

	public static void constantan() {
		Integration.addRecipeByName("thermalfoundation:tool.axe_constantan", "thermalfoundation:material", 18, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.pickaxe_constantan", "thermalfoundation:material", 18, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.sword_constantan", "thermalfoundation:material", 13, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.hoe_constantan", "thermalfoundation:material", 13, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:tool.shovel_constantan", "thermalfoundation:material", 4, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.helmet_constantan", "thermalfoundation:material", 40, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.plate_constantan", "thermalfoundation:material", 27, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.legs_constantan", "thermalfoundation:material", 36, 228, 0.7F);
		Integration.addRecipeByName("thermalfoundation:armor.boots_constantan", "thermalfoundation:material", 22, 228, 0.7F);
	}

	public static void fuel() {
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("thermalfoundation:material"), 1,
						1024), 800);
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("thermalfoundation:material"), 1,
						1025), 1600);
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("thermalfoundation:material"), 1,
						1026), 3200);
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("thermalfoundation:material"), 1,
						1027), 6400);
		Integration.addEnderfugeFuel(
				new ItemStack(StackHelper
						.itemFromRegistryName("thermalfoundation:material"), 1,
						1028), 12800);
	}
}
