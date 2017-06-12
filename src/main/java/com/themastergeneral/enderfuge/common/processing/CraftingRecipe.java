package com.themastergeneral.enderfuge.common.processing;

import com.themastergeneral.ctdcore.utils.ModUtils;
import com.themastergeneral.enderfuge.Enderfuge;
import com.themastergeneral.enderfuge.common.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingRecipe 
{
	public static void addRecipes() 
	{
		ModUtils.addShapedRecipe(Enderfuge.MODID, "enderfuge", 
				new ItemStack(ModBlocks.enderfuge), 
				new Object[]{"PPP","PCP","OOO",
    			'P', Blocks.PURPUR_BLOCK, 
    			'C', Items.END_CRYSTAL,
    			'O', Blocks.OBSIDIAN});
	}
}
