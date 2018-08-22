package com.toma.pubgmc.player;

import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.items.tools.ItemBackpack;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBackpack extends Slot
{

	public SlotBackpack(IInventory inventoryIn, int index, int xPosition, int yPosition)
	{
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return 1;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		if(stack.getItem() == ModItems.BACKPACK1 || stack.getItem() == ModItems.BACKPACK2 || stack.getItem() == ModItems.BACKPACK3)
		{
			return true;
		}
		
		else return false;
	}
}
