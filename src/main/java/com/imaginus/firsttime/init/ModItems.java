package com.imaginus.firsttime.init;

import com.imaginus.firsttime.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {

    public static Item vibranium_ingot;
    public static void init() {
        vibranium_ingot = new Item()
                .setUnlocalizedName("vibranium_ingot")
                .setTextureName(Main.MODID + ":vibranium_ingot")
                .setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(vibranium_ingot, vibranium_ingot.getUnlocalizedName());
    }
}
