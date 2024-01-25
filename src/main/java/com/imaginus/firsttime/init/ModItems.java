package com.imaginus.firsttime.init;

import com.imaginus.firsttime.Main;
import com.imaginus.firsttime.items.armors.CustomVibraniumArmor;
import com.imaginus.firsttime.items.tools.pickaxes.CustomPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static Item vibranium_raw;
    public static Item vibranium_ingot;

    public static ItemArmor vibranium_helmet;
    public static ItemArmor vibranium_chestplate;
    public static ItemArmor vibranium_leggings;
    public static ItemArmor vibranium_boots;

    public static Item vibranium_pickaxe;

    public static Item.ToolMaterial vibraniumToolMaterial = EnumHelper.addToolMaterial("vibranium", 4, 8192, 10.0F, 2.5F, 15);
    public static ItemArmor.ArmorMaterial vibraniumArmorMaterial = EnumHelper.addArmorMaterial("vibranium", 8192, new int[]{5, 10, 8, 5}, 15);

    public static void init() {
        vibranium_ingot = new Item()
                .setUnlocalizedName("vibranium_ingot")
                .setTextureName(Main.MODID + ":vibranium_ingot")
                .setCreativeTab(CreativeTabs.tabMaterials);

        vibranium_raw = new Item()
                .setUnlocalizedName("vibranium_raw")
                .setTextureName(Main.MODID + ":vibranium_raw")
                .setCreativeTab(CreativeTabs.tabMaterials);

        vibranium_helmet = new CustomVibraniumArmor(0);
        vibranium_helmet.setUnlocalizedName("vibranium_helmet")
                .setTextureName(Main.MODID + ":vibranium_helmet")
                .setCreativeTab(CreativeTabs.tabCombat);
        vibranium_chestplate = new CustomVibraniumArmor(1);
        vibranium_chestplate.setUnlocalizedName("vibranium_chestplate")
                .setTextureName(Main.MODID + ":vibranium_chestplate")
                .setCreativeTab(CreativeTabs.tabCombat);
        vibranium_leggings = new CustomVibraniumArmor(2);
        vibranium_leggings.setUnlocalizedName("vibranium_leggings")
                .setTextureName(Main.MODID + ":vibranium_leggings")
                .setCreativeTab(CreativeTabs.tabCombat);
        vibranium_boots = new CustomVibraniumArmor(3);
        vibranium_boots.setUnlocalizedName("vibranium_boots")
                .setTextureName(Main.MODID + ":vibranium_boots")
                .setCreativeTab(CreativeTabs.tabCombat);

        vibranium_pickaxe = new CustomPickaxe("vibranium_pickaxe", vibraniumToolMaterial);


        GameRegistry.registerItem(vibranium_ingot, vibranium_ingot.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_raw, vibranium_raw.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_pickaxe, vibranium_pickaxe.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_helmet, vibranium_helmet.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_chestplate, vibranium_chestplate.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_leggings, vibranium_leggings.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_boots, vibranium_boots.getUnlocalizedName());


    }
}