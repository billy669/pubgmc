package com.toma.pubgmc;

import com.toma.pubgmc.events.ModEventHandler;
import com.toma.pubgmc.proxy.CommonProxy;
import com.toma.pubgmc.tabs.PMCBlocksTab;
import com.toma.pubgmc.tabs.PMCClothingTab;
import com.toma.pubgmc.tabs.PMCItemsTab;
import com.toma.pubgmc.util.Reference;
import com.toma.pubgmc.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs pmcitemstab = new PMCItemsTab("pmcitemstab");
	public static final CreativeTabs pmcblockstab = new PMCBlocksTab("pmcblockstab");
	public static final CreativeTabs pmcclothingtab = new PMCClothingTab("pmcclothing");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("preInit has been processed!");
		MinecraftForge.EVENT_BUS.register(new ModEventHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
		System.out.println("init has been processed!");
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("postInit has been processed!");
	}
	
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
		System.out.println("Server Initialized!");
	}
}
