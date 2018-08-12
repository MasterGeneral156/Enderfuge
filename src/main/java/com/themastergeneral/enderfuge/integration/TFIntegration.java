package com.themastergeneral.enderfuge.integration;

import com.themastergeneral.ctdcore.helpers.StackHelper;

import net.minecraft.init.Items;
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
	}

	public static void invar() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 226), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_invar"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 226), 0.7F);
	}

	public static void copper() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 192), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_copper"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 192), 0.7F);
	}

	public static void tin() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 193), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_tin"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 193), 0.7F);
	}

	public static void platinum() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 198), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_platinum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 198), 0.7F);
	}

	public static void silver() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 194), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_silver"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 194), 0.7F);
	}

	public static void lead() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 195), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_lead"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 195), 0.7F);
	}

	public static void aluminum() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 196), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_aluminum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 196), 0.7F);
	}

	public static void steel() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 224), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_steel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 224), 0.7F);
	}

	public static void nickel() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 197), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_nickel"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 197), 0.7F);
	}

	public static void electrum() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 225), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_electrum"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 225), 0.7F);
	}

	public static void bronze() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 227), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_bronze"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 227), 0.7F);
	}

	public static void constantan() {
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.axe_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.pickaxe_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								18, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.sword_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.hoe_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								13, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:tool.shovel_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								4, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.helmet_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								27, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.plate_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								40, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.legs_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								36, 228), 0.7F);
		Integration
				.addSmeltingRecipe(
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:armor.boots_constantan"),
								1, OreDictionary.WILDCARD_VALUE),
						new ItemStack(
								StackHelper
										.itemFromRegistryName("thermalfoundation:material"),
								22, 228), 0.7F);
	}
}
