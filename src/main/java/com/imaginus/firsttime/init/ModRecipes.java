package com.imaginus.firsttime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void init() {

        /*
         * Add Recipe for Block of Vibranium
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModBlocks.vibranium_block),
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.vibranium_ingot
        );

        /*
         * Add Recipe to make 9 Vibranium Ingot from 1 Block of Vibranium
         */
        GameRegistry.addShapelessRecipe(
                new ItemStack(ModItems.vibranium_ingot,9),
                ModBlocks.vibranium_ore
        );

        /*
         * Add Recipe for Vibranium Pickaxe
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_pickaxe),
                "XXX",
                " Y ",
                " Y ",
                'X', ModItems.vibranium_ingot,
                'Y', Items.stick
        );

        /*
         * Add Recipe for Vibranium Helmet
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_helmet),
                "XXX",
                "X X",
                "   ",
                'X', ModItems.vibranium_ingot
        );
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_helmet),
                "   ",
                "XXX",
                "X X",
                'X', ModItems.vibranium_ingot
        );

        /*
         * Add Recipe for Vibranium Chestplate
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_chestplate),
                "X X",
                "XXX",
                "XXX",
                'X', ModItems.vibranium_ingot
        );

        /*
         * Add Recipe for Vibranium Leggings
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_leggings),
                "XXX",
                "X X",
                "X X",
                'X', ModItems.vibranium_ingot
        );

        /*
         * Add Recipe for Vibranium Boots
         */
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_boots),
                "X X",
                "X X",
                "   ",
                'X', ModItems.vibranium_ingot
        );
        GameRegistry.addShapedRecipe(
                new ItemStack(ModItems.vibranium_boots),
                "   ",
                "X X",
                "X X",
                'X', ModItems.vibranium_ingot
        );


        /*
         * Smelting Recipes
         */

        /*
         * Add Smelting Recipe for lump of vibranium from vibranium ore
         */
        GameRegistry.addSmelting(
                ModBlocks.vibranium_ore,
                new ItemStack(ModItems.vibranium_raw),
                8.0F);
    }
}
