package com.toma.pubgmc.blocks;

import com.toma.pubgmc.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Light extends BlockBase implements IHasModel
{

	public Light(String name, Material material, SoundType sound, MapColor color)
	{
		super(name, material, sound, color);
		this.setLightLevel(1.0f);
	}
	
	@Override
	@javax.annotation.Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		return NULL_AABB;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return new AxisAlignedBB(0.0, 0.8, 0.0, 1.0, 1.0, 1.0);
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
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		IBlockState state = worldIn.getBlockState(pos);
		Block block = state.getBlock();
		if(block.getMaterial(state).isSolid())
		{
			return true;
		}
		
		return false;
	}
	
}
