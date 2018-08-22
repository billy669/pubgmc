package com.toma.pubgmc.items.tools;

import com.toma.pubgmc.Main;
import com.toma.pubgmc.init.ModItems;
import com.toma.pubgmc.util.IHasModel;

import net.minecraft.item.ItemSword;

public class ItemPan extends ItemSword implements IHasModel
{
	public ItemPan(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.pmcitemstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
