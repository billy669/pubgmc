package com.toma.pubgmc.init;

import java.util.ArrayList;
import java.util.List;

import com.toma.pubgmc.blocks.BlockBase;
import com.toma.pubgmc.blocks.Furniture;
import com.toma.pubgmc.blocks.Glass;
import com.toma.pubgmc.blocks.Lamptop;
import com.toma.pubgmc.blocks.Light;
import com.toma.pubgmc.blocks.ModelAir;
import com.toma.pubgmc.blocks.ModelSolid;
import com.toma.pubgmc.blocks.ModelSolidR;
import com.toma.pubgmc.blocks.Plants;
import com.toma.pubgmc.blocks.Props;
import com.toma.pubgmc.blocks.Airdrop.Airdrop;
import com.toma.pubgmc.blocks.lamp.Lamp;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ROADASPHALT = new BlockBase("roadasphalt", Material.ROCK, SoundType.STONE, MapColor.STONE);
	public static final Block SCHOOLWALL = new BlockBase("schoolwall", Material.ROCK, SoundType.STONE, MapColor.RED_STAINED_HARDENED_CLAY);
	public static final Block SCHOOLROOF = new BlockBase("schoolroof", Material.ROCK, SoundType.STONE, MapColor.BLACK);
	public static final Block AIRDROP = new Airdrop("airdrop", Material.IRON, SoundType.METAL, MapColor.BLUE);
	public static final Block DARKWOOD = new BlockBase("darkwood", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	
	public static final Block CHAIR = new Furniture("chair", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	public static final Block TABLE = new Furniture("table", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	
	public static final Block RUINSWALL = new BlockBase("ruinswall", Material.ROCK, SoundType.STONE, MapColor.STONE);
	public static final Block SCHOOLWINDOW = new Glass("schoolwindow", Material.GLASS, SoundType.GLASS, MapColor.WHITE_STAINED_HARDENED_CLAY);
	public static final Block BLUEGLASS = new Glass("blueglass", Material.GLASS, SoundType.GLASS, MapColor.WHITE_STAINED_HARDENED_CLAY);
	public static final Block TARGET = new BlockBase("target", Material.ROCK, SoundType.STONE, MapColor.BLACK);
	
	public static final Block LAMPBOTTOM = new ModelSolid("lampbottom", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block LAMPPOST = new ModelSolid("lamppost", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block LAMPTOP = new Lamp("lamptop", Material.IRON);
	public static final Block LIGHT = new Light("light", Material.IRON, SoundType.METAL, MapColor.IRON);
	
	public static final Block CRATE = new ModelSolid("crate", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	public static final Block CRATES = new ModelSolid("crates", Material.IRON, SoundType.METAL, MapColor.IRON);
	
	public static final Block BUSH = new ModelAir("bush", Material.PLANTS, SoundType.GROUND, MapColor.GRASS);
	public static final Block WHEAT = new Plants("wheat", Material.PLANTS, SoundType.GROUND, MapColor.GRASS);
	
	public static final Block PROP1 = new Props("prop1", Material.CAKE, SoundType.CLOTH, MapColor.CLOTH);
	public static final Block PROP2 = new Props("prop2", Material.CAKE, SoundType.CLOTH, MapColor.CLOTH);
	public static final Block PROP3 = new Props("prop3", Material.CAKE, SoundType.CLOTH, MapColor.CLOTH);
	public static final Block PROP4 = new Props("prop4", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block PROP5 = new Props("prop5", Material.CLOTH, SoundType.CLOTH, MapColor.CLOTH);
	
	public static final Block FENCE = new ModelSolidR("fence", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block CONCRETE = new ModelSolidR("concrete", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block ELECTRICPOLE = new ModelSolid("electricpole", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	public static final Block ELECTRICPOLETOP = new Furniture("electricpoletop", Material.WOOD, SoundType.WOOD, MapColor.WOOD);
	public static final Block ELECTRICCABLE = new ModelAir("electriccable", Material.IRON, SoundType.METAL, MapColor.BLACK);
	public static final Block RADIOTOWER = new ModelSolid("radiotower", Material.IRON, SoundType.METAL, MapColor.IRON);
	public static final Block RADIOTOWERTOP = new ModelSolid("radiotowertop", Material.IRON, SoundType.METAL, MapColor.IRON);
}
