package com.toma.pubgmc.tabs;

import com.toma.pubgmc.init.ModBlocks;
import com.toma.pubgmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMCBlocksTab extends CreativeTabs {
	
	public PMCBlocksTab(String label)
	{
		super("pmcblockstab");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.CRATE);
	}
}
