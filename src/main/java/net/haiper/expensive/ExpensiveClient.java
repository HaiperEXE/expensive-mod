package net.haiper.expensive;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.haiper.expensive.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class ExpensiveClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CASH_REGISTER, RenderLayer.getCutout());

    }
}
