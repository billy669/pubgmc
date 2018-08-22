package com.toma.pubgmc.player;

import com.toma.pubgmc.init.ModItems;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotGhillie extends Slot
{

	public SlotGhillie(IInventory inventoryIn, int index, int xPosition, int yPosition)
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
		if(stack.getItem() == ModItems.GHILLIE_SUIT) // TODO - texture missing
		{
			return true;
		}
		
		else return false;
	}
	
}
