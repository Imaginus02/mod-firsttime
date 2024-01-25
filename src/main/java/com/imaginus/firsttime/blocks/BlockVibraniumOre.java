package com.imaginus.firsttime.blocks;

import com.imaginus.firsttime.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;

public class BlockVibraniumOre extends BlockOre {

    private static final String name = "vibranium_ore";

    public BlockVibraniumOre() {
        super();
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(Main.MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabBlock);
    }

}
