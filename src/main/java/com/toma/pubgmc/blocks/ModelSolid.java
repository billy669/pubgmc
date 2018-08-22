package com.toma.pubgmc.blocks;

import com.toma.pubgmc.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class ModelSolid extends BlockBase implements IHasModel
{
	public ModelSolid(String name, Material material, SoundType sound, MapColor color)
	{
		super(name, material, sound, color);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
}
