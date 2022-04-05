package net.haiper.expensive.util;


import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.haiper.expensive.item.ModItems;
import net.haiper.expensive.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;


public class ModRegistries {
    public static void registerModStuffs() {

        registerCustomTrades();
    }
    private static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BUSINESSMAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Items.PAPER, 1),
                            new ItemStack(ModItems.ONE_DOLLAR, 1),
                            1,3000,0.02f));
                });

    }
}
