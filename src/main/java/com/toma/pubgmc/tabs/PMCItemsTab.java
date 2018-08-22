package com.toma.pubgmc.tabs;

import com.toma.pubgmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.datafix.fixes.ItemIntIDToString;

public class PMCItemsTab extends CreativeTabs
{
	public PMCItemsTab(String label)
	{
		super("pmcitemstab");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.ADRENALINESYRINGE);
	}  
}
