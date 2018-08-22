package com.toma.pubgmc.player;

import com.toma.pubgmc.init.ModItems;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotNVGoogles extends Slot
{

	public SlotNVGoogles(IInventory inventoryIn, int index, int xPosition, int yPosition)
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
		//TODO - NV googles
		return false;
	}
	
}
