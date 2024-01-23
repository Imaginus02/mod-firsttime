package com.imaginus.firsttime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void init() {

        /*
         * Add Recipe for Block of Vibranium
         */
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.vibranium_block),
                "XXX",
                "XXX",
                "XXX",
                "X",
                ModItems.vibranium_ingot
        );

        /*
         * Add Recipe for Vibranium Pickaxe
         */
        GameRegistry.addRecipe(
                new ItemStack(ModItems.vibranium_pickaxe),
                "XXX",
                " Y ",
                " Y ",
                "X", ModItems.vibranium_ingot,
                "Y", Items.stick
        );
    }
}
