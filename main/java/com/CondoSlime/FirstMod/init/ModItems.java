package com.CondoSlime.FirstMod.init;

import java.util.ArrayList;
import java.util.List;

import com.CondoSlime.FirstMod.items.ItemBase;
import com.CondoSlime.FirstMod.items.tools.ToolAxe;
import com.CondoSlime.FirstMod.items.tools.ToolHoe;
import com.CondoSlime.FirstMod.items.tools.ToolPickaxe;
import com.CondoSlime.FirstMod.items.tools.ToolSpade;
import com.CondoSlime.FirstMod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1561, 8.0F, 3.0F, 10);
	
	//items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
}
