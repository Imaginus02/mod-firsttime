package com.imaginus.firsttime.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static com.imaginus.firsttime.Main.MODID;

public class BlockVibranium extends Block {
    private static final String name = "vibranium_block";

    public BlockVibranium() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
