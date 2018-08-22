package com.toma.pubgmc.tabs;

import com.toma.pubgmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PMCClothingTab extends CreativeTabs {
	
	public PMCClothingTab(String label)
	{
		super("pmcclothingtab");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.BACKPACK2);
	}
}
