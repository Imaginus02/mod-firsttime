package com.imaginus.firsttime.items;

import com.imaginus.firsttime.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {

    public CustomPickaxe(String name, ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(Main.MODID + ":" + name);
        this.setUnlocalizedName(name);
    }
}
