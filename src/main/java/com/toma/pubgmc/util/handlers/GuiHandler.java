package com.toma.pubgmc.util.handlers;

import com.toma.pubgmc.blocks.Airdrop.ContainerAirdrop;
import com.toma.pubgmc.blocks.Airdrop.GuiAirdrop;
import com.toma.pubgmc.blocks.Airdrop.TileEntityAirdrop;
import com.toma.pubgmc.player.ContainerCustomPlayer;
import com.toma.pubgmc.player.GuiPlayerCustom;
import com.toma.pubgmc.player.InventoryPlayerCustom;
import com.toma.pubgmc.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_AIRDROP) return new ContainerAirdrop(player.inventory, (TileEntityAirdrop)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.PLAYER_INV) return new ContainerCustomPlayer(player, (InventoryPlayerCustom) player.inventory, false);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_AIRDROP) return new GuiAirdrop(player.inventory, (TileEntityAirdrop)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.PLAYER_INV) return new ContainerCustomPlayer(player, (InventoryPlayerCustom) player.inventory, false);
		return null;
	}
	
}
