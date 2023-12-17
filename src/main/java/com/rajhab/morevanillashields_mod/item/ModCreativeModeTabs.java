package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, morevanillashields.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEM_GROUP = CREATIVE_MODE_TABS.register("morevanillashields",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_SHIELD.get()))
                    .title(Component.translatable("creativetab.morevanillashields"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.LEATHER_SHIELD.get());
                        pOutput.accept(ModItems.COAL_SHIELD.get());
                        pOutput.accept(ModItems.GOLD_SHIELD.get());
                        //pOutput.accept(ModItems.REDSTONE_SHIELD.get());
                        pOutput.accept(ModItems.EMERALD_SHIELD.get());
                        pOutput.accept(ModItems.AMETHYST_SHIELD.get());
                        pOutput.accept(ModItems.DIAMOND_SHIELD.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHIELD.get());
                        pOutput.accept(ModItems.NETHERITE_SHIELD.get());
                        pOutput.accept(ModItems.END_CRYSTAL_SHIELD.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}