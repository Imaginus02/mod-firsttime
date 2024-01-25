package com.imaginus.firsttime.items.tools.pickaxes;

import com.imaginus.firsttime.Main;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CustomPickaxe extends ItemPickaxe {

    public CustomPickaxe(String name, ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName(Main.MODID + ":" + name);
        this.setUnlocalizedName(name);
    }

//    public boolean onBlockStartBreak(ItemStack stack, BlockPos pos, EntityPlayer player) {
//        World world = player.world;
//
//        // Play the break sound (use the appropriate sound for your item)
//        world.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.PLAYERS, 1.0F, 1.0F);
//
//        // Continue with the default block breaking logic
//        return super.onBlockStartBreak(stack, pos, player);
//    }
//
//    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, int side, float hitX, float hitY, float hitZ) {
//        // Play the use sound (use the appropriate sound for your item)
//        world.playSound(player, pos, SoundEvents.ITEM_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
//
//        // Continue with the default item use logic
//        return super.onItemUseFirst(stack, player, world, pos, side, hitX, hitY, hitZ);
//    }

}
