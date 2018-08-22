package com.toma.pubgmc.blocks.lamp;

import com.toma.pubgmc.Main;
import com.toma.pubgmc.init.ModBlocks;
import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Lamp extends Block implements IHasModel
{
	
	public static final PropertyBool ON = PropertyBool.create("on");
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public Lamp(String name, Material materialIn)
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pmcblockstab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ON, false));
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(2.0F);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "invetory");
	}
	
	@Override
	public int getLightValue(IBlockState state)
	{
		return state.getValue(ON) ? 15 : 0;
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {ON, FACING});
	}
	
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        return state.withProperty(FACING, placer.getHorizontalFacing()).withProperty(ON, false);
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
    	return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(ON, Boolean.valueOf((meta & 4) != 0));
    }
    
    @Override
    public int getMetaFromState(IBlockState state)
    {
    	int i = 0;
    	i = i | ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
    	
    	if(((Boolean)state.getValue(ON)).booleanValue())
    	{
    		i |= 4;
    	}
    	
    	return i;
    }
    
    @Override
    public boolean hasTileEntity(IBlockState state) 
    {
    	return true;
    }
    
    @Override
    public TileEntity createTileEntity(World world, IBlockState state)
    {
    	return new TileEntityLamp();
    }
    
    @Override
    public BlockRenderLayer getBlockLayer()
    {
    	return BlockRenderLayer.CUTOUT;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
    	return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) 
    {
    	return false;
    }

}
