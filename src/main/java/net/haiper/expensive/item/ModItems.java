package net.haiper.expensive.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.haiper.expensive.Expensive;
import net.haiper.expensive.item.custom.ModSwordItem;
import net.haiper.expensive.item.custom.OneDollarItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Expensive.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Regisering Mod Items for " + Expensive.MOD_ID);
    }

    // items: //
    public static final Item LONG_WOODEN_SWORD = registerItem("long_wooden_sword",
             new ModSwordItem(ModToolMaterial.WOODEN, 8, -2.4f,
                     new FabricItemSettings().group(ModItemGroups.MONEY)));

    public static final Item ONE_DOLLAR = registerItem("one_dollar",
            new OneDollarItem
                    (new FabricItemSettings().group(ModItemGroups.MONEY).maxDamage(1)));

    public static final Item ONEHUNDRED_DOLLAR = registerItem("onehundred_dollar",
            new OneDollarItem
                    (new FabricItemSettings().group(ModItemGroups.MONEY).maxDamage(1)));

    public static final Item ONETHOUSAND_DOLLAR = registerItem("onethousand_dollar",
            new OneDollarItem
                    (new FabricItemSettings().group(ModItemGroups.MONEY).maxDamage(1)));

    public static final Item TENTHOUSAND_DOLLAR = registerItem("tenthousand_dollar",
            new OneDollarItem
                    (new FabricItemSettings().group(ModItemGroups.MONEY).maxDamage(1)));

    public static final Item ONEHUNDREDTHOUSAND_DOLLAR = registerItem("onehundredthousand_dollar",
            new OneDollarItem
                    (new FabricItemSettings().group(ModItemGroups.MONEY).maxDamage(1)));
}
