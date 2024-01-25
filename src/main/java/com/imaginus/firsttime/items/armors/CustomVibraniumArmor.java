package com.imaginus.firsttime.items.armors;

import com.imaginus.firsttime.Main;
import com.imaginus.firsttime.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

import java.lang.ref.Reference;

public class CustomVibraniumArmor extends ItemArmor implements ISpecialArmor {

    public int armorType;

    public CustomVibraniumArmor(int armorType) {
        super(ModItems.vibraniumArmorMaterial, 3, armorType);
        this.armorType = armorType;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
        return new ArmorProperties(0, 1.0F, Integer.MAX_VALUE);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return ModItems.vibraniumArmorMaterial.getDamageReductionAmount(armorType);
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        this.setDamage(stack, this.getDamage(stack) + damage);
    }

    @Override
    public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
        if (armor.getItem() == ModItems.vibranium_leggings) {
            return Main.MODID+":textures/models/armor/vibranium_layer_2.png";
        } else {
            return Main.MODID+":textures/models/armor/vibranium_layer_1.png";
        }
    }
}
