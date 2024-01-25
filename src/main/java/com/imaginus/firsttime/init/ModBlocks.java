package com.imaginus.firsttime.init;

import com.imaginus.firsttime.blocks.BlockVibranium;
import com.imaginus.firsttime.blocks.BlockVibraniumOre;
import net.minecraft.block.Block;
import net.minecraftforge.event.terraingen.OreGenEvent;

public class ModBlocks {

    public static Block vibranium_block;
    public static Block vibranium_ore;

    public static void init() {
        vibranium_block = new BlockVibranium();
        vibranium_ore = new BlockVibraniumOre();
    }

}
