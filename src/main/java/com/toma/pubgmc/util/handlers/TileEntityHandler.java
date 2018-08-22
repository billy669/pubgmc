package com.toma.pubgmc.util.handlers;

import com.toma.pubgmc.blocks.Airdrop.TileEntityAirdrop;
import com.toma.pubgmc.blocks.lamp.TileEntityLamp;
import com.toma.pubgmc.util.Reference;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAirdrop.class, Reference.MOD_ID + ":airdrop");
		GameRegistry.registerTileEntity(TileEntityLamp.class, Reference.MOD_ID + ":lamp");
	}

}
