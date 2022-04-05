package net.haiper.expensive.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class OneDollarItem extends Item  {

    public OneDollarItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (!world.isClient()) {
            user.getStackInHand(hand).damage(1, user,
                    (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        }
        return super.use(world, user, hand);
    }
}
