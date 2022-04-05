package net.haiper.expensive.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.haiper.expensive.Expensive;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MONEY = FabricItemGroupBuilder.build(new Identifier(Expensive.MOD_ID, "money"),
            () -> new ItemStack(ModItems.ONE_DOLLAR));

}
