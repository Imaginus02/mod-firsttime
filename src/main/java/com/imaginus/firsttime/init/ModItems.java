package com.imaginus.firsttime.init;

import com.imaginus.firsttime.Main;
import com.imaginus.firsttime.items.CustomPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static Item vibranium_ingot;
    public static Item vibranium_pickaxe;

    public static Item.ToolMaterial vibranium = EnumHelper.addToolMaterial("vibranium", 4,8192,10.0F,2.5F,15);;

    public static void init() {
        vibranium_ingot = new Item()
                .setUnlocalizedName("vibranium_ingot")
                .setTextureName(Main.MODID + ":vibranium_ingot")
                .setCreativeTab(CreativeTabs.tabMaterials);

        vibranium_pickaxe = new CustomPickaxe("vibranium_pickaxe", vibranium);


        GameRegistry.registerItem(vibranium_ingot, vibranium_ingot.getUnlocalizedName());
        GameRegistry.registerItem(vibranium_pickaxe, vibranium_pickaxe.getUnlocalizedName());

    }
}