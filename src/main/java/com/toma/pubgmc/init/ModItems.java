package com.toma.pubgmc.init;

import java.util.ArrayList;
import java.util.List;

import com.toma.pubgmc.items.ItemBase;
import com.toma.pubgmc.items.armor.ArmorBase;
import com.toma.pubgmc.items.cases.Case1;
import com.toma.pubgmc.items.tools.ItemGhillie;
import com.toma.pubgmc.items.tools.ItemHealing;
import com.toma.pubgmc.items.tools.ItemPan;
import com.toma.pubgmc.player.EntityEquipmentSlotCustom;
import com.toma.pubgmc.player.SlotGhillie;
import com.toma.pubgmc.util.Reference;

import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial GHILLIE = EnumHelper.addArmorMaterial("ghillie", Reference.MOD_ID + ":ghillie", -1, new int[] {1, 1, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial LVL1 = EnumHelper.addArmorMaterial("lvl1", Reference.MOD_ID + ":lvl1", 1, new int[] {0, 0, 3, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial LVL2 = EnumHelper.addArmorMaterial("lvl2", Reference.MOD_ID + ":lvl2", 1, new int[] {0, 0, 6, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial LVL3 = EnumHelper.addArmorMaterial("lvl3", Reference.MOD_ID + ":lvl3", 1, new int[] {0, 0, 10, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial CLOTH1 = EnumHelper.addArmorMaterial("set1", Reference.MOD_ID + ":set1", -1, new int[] {0,  0,  0,  0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial CLOTH2 = EnumHelper.addArmorMaterial("set2", Reference.MOD_ID + ":set2", -1, new int[] {0,  0,  0,  0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static final ArmorMaterial CLOTH3 = EnumHelper.addArmorMaterial("set3", Reference.MOD_ID + ":set3", -1, new int[] {0,  0,  0,  0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	
	public static final ToolMaterial MATERIAL_PAN = EnumHelper.addToolMaterial("material_pan", 0, -1, 0.0F, 15.0F, 0);
	
//Items
	public static final Item BACKPACK1 = new ItemHealing("backpack1");
	public static final Item BACKPACK2 = new ItemHealing("backpack2");
	public static final Item BACKPACK3 = new ItemHealing("backpack3");
	public static final Item BANDAGE = new ItemHealing("bandage");
	public static final Item FIRSTAIDKIT = new ItemHealing("firstaidkit");
	public static final Item MEDKIT = new ItemHealing("medkit");
	public static final Item ENERGYDRINK = new ItemHealing("energydrink");
	public static final Item PAINKILLERS = new ItemHealing("painkillers");
	public static final Item ADRENALINESYRINGE = new ItemHealing("adrenalinesyringe");
	public static final Item IBLOCK = new ItemBase("iblock");
	
	public static final Item GHILLIE_SUIT = new ItemGhillie("ghillie_suit", EntityEquipmentSlotCustom.GHILLIE);
	
//Cases
	public static final Item CASE1 = new Case1("case1");
	
//Melee
	public static final ItemSword PAN = new ItemPan("pan", MATERIAL_PAN);
	
//Armor
	//Ghillie
	public static final Item GHILLIEHELMET = new ArmorBase("ghilliehelmet", GHILLIE, 1, EntityEquipmentSlot.HEAD);
	public static final Item GHILLIEBODY = new ArmorBase("ghilliebody", GHILLIE, 1, EntityEquipmentSlot.CHEST);
	public static final Item GHILLIELEGS = new ArmorBase("ghillielegs", GHILLIE, 2, EntityEquipmentSlot.LEGS);
	public static final Item GHILLIEBOOTS = new ArmorBase("ghillieboots", GHILLIE, 1, EntityEquipmentSlot.FEET);
	
	//Lvl1
	public static final Item ARMOR1HELMET = new ArmorBase("armor1helmet", LVL1, 1, EntityEquipmentSlot.HEAD);
	public static final Item ARMOR1BODY = new ArmorBase("armor1body", LVL1, 1, EntityEquipmentSlot.CHEST);
	
	//Lvl2
	public static final Item ARMOR2HELMET = new ArmorBase("armor2helmet", LVL2, 1, EntityEquipmentSlot.HEAD);
	public static final Item ARMOR2BODY = new ArmorBase("armor2body", LVL2, 1, EntityEquipmentSlot.CHEST);
	
	//Lvl3
	public static final Item ARMOR3HELMET = new ArmorBase("armor3helmet", LVL3, 1, EntityEquipmentSlot.HEAD);
	public static final Item ARMOR3BODY = new ArmorBase("armor3body", LVL3, 1, EntityEquipmentSlot.CHEST);
	
	//BETA CASE
	public static final Item BLACK_GLASSES = new ArmorBase("black_glasses", CLOTH1, 1, EntityEquipmentSlot.HEAD);
	public static final Item YELLOW_TSHIRT = new ArmorBase("yellow_tshirt", CLOTH1, 1, EntityEquipmentSlot.CHEST);
	public static final Item GRAY_TOP = new ArmorBase("gray_top", CLOTH2, 1, EntityEquipmentSlot.CHEST);
	public static final Item BROWN_CAP = new ArmorBase("brown_cap", CLOTH2, 1, EntityEquipmentSlot.HEAD);
	public static final Item WHITE_BOOTS = new ArmorBase("white_boots", CLOTH2, 1, EntityEquipmentSlot.FEET);
	public static final Item OFFICIAL_LEGS = new ArmorBase("official_legs", CLOTH3, 2, EntityEquipmentSlot.LEGS);
	
}
