package com.rajhab.morevanillashields_mod.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;

public class EndCrystalShield extends ShieldItem {
    public EndCrystalShield() {
        super((new Properties())
                .durability(750)
        );
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;

    }
}

