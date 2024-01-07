package com.rajhab.morevanillashields_mod;


import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShieldConfig
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.Builder P = BUILDER
            .push("README!!!!!!!!!!!!!!!!!!!! Only change the Values before creating a world or a server! Or change the values before creating or having a Shield! If you change the values (and you already used a shield), your world should break");

    public static final ForgeConfigSpec.ConfigValue<Integer> LEATHER_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Leather Shield. Default Value is 196")
            .define("leatherShieldDurability", 196);

    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Gold Shield. Default Value is 322")
            .define("goldShieldDurability", 322);

    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Diamond Shield. Default Value is 512")
            .define("diamondShieldDurability", 512);

    public static final ForgeConfigSpec.ConfigValue<Integer> GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Glass Shield. Default Value is 300")
            .define("glassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> TINTED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Tinted Glass Shield. Default Value is 300")
            .define("tintedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHERITE_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Netherite Shield. Default Value is 2042")
            .define("netheriteShieldDurability", 2042);

    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Emerald Shield. Default Value is 512")
            .define("emeraldShieldDurability", 512);

    public static final ForgeConfigSpec.ConfigValue<Integer> AMETHYST_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Amethyst Shield. Default Value is 432")
            .define("amethystShieldDurability", 432);

    public static final ForgeConfigSpec.ConfigValue<Integer> OBSIDIAN_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Obsidian Shield. Default Value is 610")
            .define("obsidianShieldDurability", 610);

    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Coal Shield. Default Value is 268")
            .define("coalShieldDurability", 268);

    public static final ForgeConfigSpec.ConfigValue<Integer> END_CRYSTAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of End Crystal Shield. Default Value is 750")
            .define("endCrystalShieldDurability", 750);


    static final ForgeConfigSpec SPEC = BUILDER.build();
    public static int leatherShieldDurability;
    public static int goldShieldDurability;
    public static int diamondShieldDurability;
    public static int glassShieldDurability;
    public static int tintedGlassShieldDurability;
    public static int netheriteShieldDurability;
    public static int emeraldShieldDurability;
    public static int amethystShieldDurability;
    public static int obsidianShieldDurability;
    public static int coalShieldDurability;
    public static int endCrystalShieldDurability;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        leatherShieldDurability = LEATHER_SHIELD_DURABILITY.get();
        goldShieldDurability = GOLD_SHIELD_DURABILITY.get();
        diamondShieldDurability = DIAMOND_SHIELD_DURABILITY.get();
        glassShieldDurability = GLASS_SHIELD_DURABILITY.get();
        tintedGlassShieldDurability = TINTED_GLASS_SHIELD_DURABILITY.get();
        netheriteShieldDurability = NETHERITE_SHIELD_DURABILITY.get();
        emeraldShieldDurability = EMERALD_SHIELD_DURABILITY.get();
        amethystShieldDurability = AMETHYST_SHIELD_DURABILITY.get();
        obsidianShieldDurability = OBSIDIAN_SHIELD_DURABILITY.get();
        coalShieldDurability = COAL_SHIELD_DURABILITY.get();
        endCrystalShieldDurability = END_CRYSTAL_SHIELD_DURABILITY.get();
    }
}