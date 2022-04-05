package net.haiper.expensive;

import net.fabricmc.api.ModInitializer;
import net.haiper.expensive.block.ModBlocks;
import net.haiper.expensive.item.ModItems;
import net.haiper.expensive.util.ModRegistries;
import net.haiper.expensive.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Expensive implements ModInitializer {
	public static final String MOD_ID = "expensive";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModRegistries.registerModStuffs();
		ModVillagers.setupPOIs();
		ModBlocks.registerModBlocks();
	}
}
