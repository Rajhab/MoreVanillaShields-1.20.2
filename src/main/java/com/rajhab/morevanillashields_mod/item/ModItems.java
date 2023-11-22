package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.item.custom.EndCrystalShield;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, morevanillashields.MOD_ID);

    //Shield
    public static final RegistryObject<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().durability(216)));

    public static final RegistryObject<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().durability(356)));

    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().durability(2042)));

    /*public static final RegistryObject<Item> REDSTONE_SHIELD = ITEMS.register("redstone_shield",
            () -> new ShieldItem(new Item.Properties().durability(316)));*/

    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().durability(432)));

    public static final RegistryObject<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().durability(610)));

    public static final RegistryObject<EndCrystalShield> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield", EndCrystalShield::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
