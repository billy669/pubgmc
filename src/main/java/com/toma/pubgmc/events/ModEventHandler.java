package com.toma.pubgmc.events;

import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.player.ContainerCustomPlayer;
import com.toma.pubgmc.player.GuiPlayerCustom;
import com.toma.pubgmc.player.InventoryPlayerCustom;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameType;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEventHandler 
{
	/**
	*@SideOnly(Side.CLIENT)
	*@SubscribeEvent
	*public void onOpenInv(GuiOpenEvent ev)
	*{
	*	if(ev.getGui() != null && ev.getGui().getClass() == net.minecraft.client.gui.inventory.GuiInventory.class)
	*	{
	*		ev.setGui(new GuiPlayerCustom(Minecraft.getMinecraft().player));
	*	}
	*}
	*
	*@SubscribeEvent
	*public void onJoinWorld(EntityJoinWorldEvent ev)
	*{
	*	if(ev.getEntity() instanceof EntityPlayer)
	*	{
	*		EntityPlayer player = (EntityPlayer)ev.getEntity();
	*		
	*		if(!(player.inventory instanceof InventoryPlayerCustom))
	*		{
	*			player.inventory = new InventoryPlayerCustom(player);
	*			player.inventoryContainer = new ContainerCustomPlayer(player, (InventoryPlayerCustom)player.inventory, !player.world.isRemote);
	*			player.openContainer = player.inventoryContainer;
	*		}
	*	}
	*}
	*/
	
	@SubscribeEvent
	public void renderOverlay(RenderGameOverlayEvent.Pre render)
	{
		EntityPlayer player = Minecraft.getMinecraft().player;
		
		if(render.getType() == ElementType.DEBUG && !player.capabilities.isCreativeMode)
		{
			render.setCanceled(true);
		}
		
		//For the future to replace the old crosshair with new, dynamic one.
		/**
		*if(render.getType() == ElementType.CROSSHAIRS && !player.capabilities.isCreativeMode)
		*{
		*	render.setCanceled(true);
		*}
		*/
	}
}
