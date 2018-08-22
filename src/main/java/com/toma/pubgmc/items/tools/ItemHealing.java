package com.toma.pubgmc.items.tools;

import java.util.List;

import com.toma.pubgmc.Main;
import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.items.ItemBase;
import com.toma.pubgmc.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ItemHealing extends ItemBase implements IHasModel
{

	public ItemHealing(String name)
	{
		super(name);
	}
	
	@Override
	public int getItemStackLimit()
	{
		if(this == ModItems.BANDAGE)
		{
			return 5;
		}
		
		else if(this == ModItems.ENERGYDRINK || this == ModItems.PAINKILLERS)
		{
			return 3;
		}

		else return 1;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) 
	{
		if(this == ModItems.BANDAGE)
		{
			return 80;
		}
		
		else if(this == ModItems.ENERGYDRINK)
		{
			return 80;
		}
		
		else if(this == ModItems.PAINKILLERS || this == ModItems.FIRSTAIDKIT)
		{
			return 120;
		}
		
		else if(this == ModItems.MEDKIT || this == ModItems.ADRENALINESYRINGE)
		{
			return 160;
		}

		else return 1;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		MinecraftServer minecraftserver = FMLCommonHandler.instance().getMinecraftServerInstance();
		EntityPlayer entityplayer = entityLiving instanceof EntityPlayer ? (EntityPlayer)entityLiving : null;
		if(entityLiving instanceof EntityPlayer)
		{
			if(!entityplayer.capabilities.isCreativeMode)
			{
				if(this == ModItems.BANDAGE)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 0));
				}
				
				else if(this == ModItems.FIRSTAIDKIT)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 1));
				}
				
				else if(this == ModItems.MEDKIT)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 4, 5));
				}
				
				else if(this == ModItems.ENERGYDRINK)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 0));
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));
				}
				
				else if(this == ModItems.PAINKILLERS)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 0));
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1800, 0));
				}
				
				else if(this == ModItems.ADRENALINESYRINGE)
				{
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1800, 0));
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3600, 0));
				}
				
				else if(this == ModItems.BACKPACK1)
				{
					minecraftserver.getCommandManager().executeCommand(entityplayer, "scoreboard players set @p backpack 1");    
				}
				
				else if(this == ModItems.BACKPACK2)
				{
					minecraftserver.getCommandManager().executeCommand(entityplayer, "scoreboard players set @p backpack 2");
				}
				
				else if(this == ModItems.BACKPACK3)
				{
					minecraftserver.getCommandManager().executeCommand(entityplayer, "scoreboard players set @p backpack 3");
				}
				
				stack.shrink(1);
			}

		}
		
		return stack;
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.NONE;
	}
	
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
    	ItemStack stack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
    }
    
	
}
