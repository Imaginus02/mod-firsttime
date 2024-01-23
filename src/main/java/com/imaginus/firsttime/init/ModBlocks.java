package com.imaginus.firsttime.init;

import com.imaginus.firsttime.blocks.BlockVibranium;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block vibranium_block;

    public static void init() {
        vibranium_block = new BlockVibranium();
    }

}
