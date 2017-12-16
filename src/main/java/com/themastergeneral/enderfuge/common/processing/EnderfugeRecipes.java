package com.themastergeneral.enderfuge.common.processing;

import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.google.common.collect.Maps;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.items.ModItems;

public class EnderfugeRecipes {
	private static final EnderfugeRecipes SMELTING_BASE = new EnderfugeRecipes();
	/** The list of smelting results. */
	private final Map<ItemStack, ItemStack> smeltingList = Maps
			.<ItemStack, ItemStack> newHashMap();
	/**
	 * A list which contains how many experience points each recipe output will
	 * give.
	 */
	private final Map<ItemStack, Float> experienceList = Maps
			.<ItemStack, Float> newHashMap();

	/**
	 * Returns an instance of FurnaceRecipes.
	 */
	public static EnderfugeRecipes instance() {
		return SMELTING_BASE;
	}

	private EnderfugeRecipes() {
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_AXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_PICKAXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_SWORD, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_HOE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_SHOVEL, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				4), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_HELMET, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				27), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_CHESTPLATE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				40), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_LEGGINGS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				36), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.GOLDEN_BOOTS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.GOLD_NUGGET,
				22), 0.7F);

		this.addSmeltingRecipe(new ItemStack(Items.IRON_AXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_PICKAXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_SWORD, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_HOE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_SHOVEL, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				4), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_HELMET, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				27), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_CHESTPLATE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				40), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_LEGGINGS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				36), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.IRON_BOOTS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				22), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.CHAINMAIL_HELMET, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				27), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				40), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				36), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.CHAINMAIL_BOOTS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(Items.IRON_NUGGET,
				22), 0.7F);
		//Diamond Stuffs
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_AXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_PICKAXE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				18), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_SWORD, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_HOE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				13), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_SHOVEL, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				4), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_HELMET, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				27), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				40), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_LEGGINGS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				36), 0.7F);
		this.addSmeltingRecipe(new ItemStack(Items.DIAMOND_BOOTS, 1,
				OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.nuggetdiamond,
				22), 0.7F);
		
	}

	/**
	 * Adds a smelting recipe using an Item as the input item.
	 */
	public void addSmelting(ItemStack input, ItemStack stack, float experience) {
		this.addSmeltingRecipe(input, stack, experience);
	}

	public void removeSmelting(ItemStack input, ItemStack stack) {
		ItemStack result = getSmeltingResult(input);
		if (result != stack) {
			Enderfuge.logger
					.error("Could not remove "
							+ input
							+ " = "
							+ stack
							+ " recipe, as it does not exist in the Enderfuge registry.");
			return;
		}
		this.smeltingList.remove(input, stack);
		float xp = getSmeltingExperience(stack);
		if (xp != 0F) {
			this.experienceList.remove(stack, xp);
		}
	}

	/**
	 * Adds a smelting recipe using an ItemStack as the input for the recipe.
	 */
	public void addSmeltingRecipe(ItemStack input, ItemStack stack,
			float experience) {
		if (getSmeltingResult(input) != ItemStack.EMPTY) {
			Enderfuge.logger
					.info("Ignored smelting recipe with conflicting input: "
							+ input + " = " + stack);
			return;
		}
		this.smeltingList.put(input, stack);
		this.experienceList.put(stack, Float.valueOf(experience));
	}

	/**
	 * Returns the smelting result of an item.
	 */
	public ItemStack getSmeltingResult(ItemStack stack) {
		for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet()) {
			if (this.compareItemStacks(stack, (ItemStack) entry.getKey())) {
				return (ItemStack) entry.getValue();
			}
		}

		return ItemStack.EMPTY;
	}

	/**
	 * Compares two itemstacks to ensure that they are the same. This checks
	 * both the item and the metadata of the item.
	 */
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem()
				&& (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1
						.getMetadata());
	}

	public Map<ItemStack, ItemStack> getSmeltingList() {
		return this.smeltingList;
	}

	public float getSmeltingExperience(ItemStack stack) {
		float ret = stack.getItem().getSmeltingExperience(stack);
		if (ret != -1)
			return ret;

		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) {
			if (this.compareItemStacks(stack, (ItemStack) entry.getKey())) {
				return ((Float) entry.getValue()).floatValue();
			}
		}

		return 0.0F;
	}
}