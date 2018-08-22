package com.toma.pubgmc.items.cases;

import java.util.List;

import com.toma.pubgmc.Main;
import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.items.ItemBase;
import com.toma.pubgmc.util.IHasModel;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

public class Case1 extends ItemBase implements IHasModel 
{

	public Case1(String name)
	{
		super(name);
		this.setCreativeTab(Main.pmcitemstab);
	}
	
    @Override
    public int getItemStackLimit()
    {
    	return 5;
    }
    
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand)
	{
		ItemStack stack = entity.getHeldItem(hand);
		double rand = Math.random() * 100;
		
		//LEGENDARY
		if(rand <= 1)
		{		
			entity.addItemStackToInventory(new ItemStack(ModItems.OFFICIAL_LEGS, 64));
		}
		
		//VERY RARE
		else if (rand <= 5)
		{
			entity.addItemStackToInventory(new ItemStack(ModItems.BLACK_GLASSES, 64));
		}
		
		//RARE
		else if(rand <= 19)
		{
			entity.addItemStackToInventory(new ItemStack(ModItems.WHITE_BOOTS, 64));
		}
		
		//COMMON
		else if(rand <= 46)
		{
			entity.addItemStackToInventory(new ItemStack(ModItems.GRAY_TOP, 64));
		}
		
		else if(rand <= 73)
		{
			entity.addItemStackToInventory(new ItemStack(ModItems.YELLOW_TSHIRT, 64));
		}
		
		else if(rand <= 100)
		{
			entity.addItemStackToInventory(new ItemStack(ModItems.BROWN_CAP, 64));
		}
		
		stack.shrink(1);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add(TextFormatting.GOLD + "Legendary PMC Leggings" + TextFormatting.RESET + " - 1%");
		tooltip.add(TextFormatting.RED + "Sunglasses" + TextFormatting.RESET + " - 5%");
		tooltip.add(TextFormatting.AQUA + "White Boots" + TextFormatting.RESET + " - 19%");
		tooltip.add(TextFormatting.GRAY + "Gray Top" + TextFormatting.RESET + " - 27%");
		tooltip.add(TextFormatting.GRAY + "Yellow T-Shirt" + TextFormatting.RESET + " - 27%");
		tooltip.add(TextFormatting.GRAY + "Brown Cap" + TextFormatting.RESET + " - 27%");
	}
}
