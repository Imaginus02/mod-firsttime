package com.imaginus.firsttime;

import com.imaginus.firsttime.init.ModBlocks;
import com.imaginus.firsttime.init.ModItems;
import com.imaginus.firsttime.init.ModOreDictionary;
import com.imaginus.firsttime.init.ModRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "firsttime";
    public static final String VERSION = "1.7.10-A1";

    @Mod.Instance(MODID)
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        ModOreDictionary.init();
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }


}
