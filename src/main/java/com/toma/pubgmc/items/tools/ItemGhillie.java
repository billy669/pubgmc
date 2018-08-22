package com.toma.pubgmc.items.tools;

import com.toma.pubgmc.Main;
import com.toma.pubgmc.items.ItemBase;
import com.toma.pubgmc.player.EntityEquipmentSlotCustom;
import com.toma.pubgmc.player.ModelBipedCustom;
import com.toma.pubgmc.player.SlotGhillie;
import com.toma.pubgmc.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGhillie extends ItemBase implements IHasModel
{
	
	public final EntityEquipmentSlotCustom eqSlot;
	
	public ItemGhillie(String name, EntityEquipmentSlotCustom slotIn)
	{
		super(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.pmcitemstab);
		this.eqSlot = slotIn;
	}
	
    @SideOnly(Side.CLIENT)
    public EntityEquipmentSlotCustom getEquipmentSlot()
    {
        return this.eqSlot;
    }
    
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
    {
    	return new ModelBipedCustom();
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
    	return "trm:textures/models/armor/ghillie_layer_1";
    }

}
