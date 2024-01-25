package com.imaginus.firsttime.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {

    public static void init() {
        OreDictionary.registerOre("vibranium_ingot",ModItems.vibranium_ingot);
        OreDictionary.registerOre("vibranium_block",ModBlocks.vibranium_block);
        OreDictionary.registerOre("vibranium_ore",ModBlocks.vibranium_ore);
    }
}
