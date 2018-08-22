package com.toma.pubgmc.blocks.lamp;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;

public class TileEntityLamp extends TileEntity implements ITickable
{

	@Override
	public void update()
	{
		IBlockState state = world.getBlockState(pos);
		if(!world.provider.isDaytime() && !world.isRemote && state.getValue(Lamp.ON) == false)
		{
			world.setBlockState(pos, state.getActualState(world, pos).withProperty(Lamp.ON, true), 2);
		}
		
		if(world.provider.isDaytime() && !world.isRemote && state.getValue(Lamp.ON) == true)
		{
			world.setBlockState(pos, state.getActualState(world, pos).withProperty(Lamp.ON, false), 2);
		}
	}

}
