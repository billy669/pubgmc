package com.toma.pubgmc.player;

import javax.annotation.Nullable;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerCustomPlayer extends Container
{
	 private static final EntityEquipmentSlot[] VALID_EQUIPMENT_SLOTS = new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET};
	    private final EntityPlayer player;
	    private boolean isLocalWorld;
	    
	    public ContainerCustomPlayer(EntityPlayer player, InventoryPlayerCustom inventory, boolean localWorld)
	    {
	        this.isLocalWorld = localWorld;
	        this.player = player;
	        
	        
	        this.addSlotToContainer(new SlotNVGoogles(inventory, 41, 77, 8));
	        this.addSlotToContainer(new SlotGhillie(inventory, 42, 77, 26));
	        this.addSlotToContainer(new SlotBackpack(inventory, 43, 77, 44));

	        for (int k = 0; k < 4; ++k)
	        {
	            final EntityEquipmentSlot entityequipmentslot = VALID_EQUIPMENT_SLOTS[k];
	            this.addSlotToContainer(new Slot(inventory, 36 + (3 - k), 8, 8 + k * 18)
	            {
	                /**
	                 * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1
	                 * in the case of armor slots)
	                 */
	                public int getSlotStackLimit()
	                {
	                    return 1;
	                }
	                /**
	                 * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace
	                 * fuel.
	                 */
	                public boolean isItemValid(ItemStack stack)
	                {
	                    return stack.getItem().isValidArmor(stack, entityequipmentslot, player);
	                }
	                /**
	                 * Return whether this slot's stack can be taken from this slot.
	                 */
	                public boolean canTakeStack(EntityPlayer playerIn)
	                {
	                    ItemStack itemstack = this.getStack();
	                    return !itemstack.isEmpty() && !playerIn.isCreative() && EnchantmentHelper.hasBindingCurse(itemstack) ? false : super.canTakeStack(playerIn);
	                }
	                @Nullable
	                @SideOnly(Side.CLIENT)
	                public String getSlotTexture()
	                {
	                    return ItemArmor.EMPTY_SLOT_NAMES[entityequipmentslot.getIndex()];
	                }
	            });
	        }

	        for (int l = 0; l < 3; ++l)
	        {
	            for (int j1 = 0; j1 < 9; ++j1)
	            {
	                this.addSlotToContainer(new Slot(inventory, j1 + (l + 1) * 9, 8 + j1 * 18, 84 + l * 18));
	            }
	        }

	        for (int i1 = 0; i1 < 9; ++i1)
	        {
	            this.addSlotToContainer(new Slot(inventory, i1, 8 + i1 * 18, 142));
	        }

	        this.addSlotToContainer(new Slot(inventory, 40, 77, 62)
	        {
	            @Nullable
	            @SideOnly(Side.CLIENT)
	            public String getSlotTexture()
	            {
	                return "minecraft:items/empty_armor_slot_shield";
	            }
	        });

		}
	    
	    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
	    {
	        ItemStack itemstack = ItemStack.EMPTY;
	        Slot slot = this.inventorySlots.get(index);

	        if (slot != null && slot.getHasStack())
	        {
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();

	            if (index < this.inventorySlots.size())
	            {
	                if (!this.mergeItemStack(itemstack1, 0, this.inventorySlots.size(), true))
	                {
	                    return ItemStack.EMPTY;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 0, 43, false))
	            {
	                return ItemStack.EMPTY;
	            }

	            if (itemstack1.isEmpty())
	            {
	                slot.putStack(ItemStack.EMPTY);
	            }
	            else
	            {
	                slot.onSlotChanged();
	            }
	        }

	        return itemstack;
	    }

		@Override
		public boolean canInteractWith(EntityPlayer playerIn) 
		{
			return true;
		}
		
		@Override
		public void detectAndSendChanges() 
		{
			super.detectAndSendChanges();
			
			for(int i = 0; i < this.listeners.size(); ++i) 
			{
				IContainerListener listener = (IContainerListener)this.listeners.get(i);
			}
		}
}