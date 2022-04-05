package net.haiper.expensive.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.haiper.expensive.Expensive;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

        public static final PointOfInterestType BUSINESS_MAN = registerPOI("blasterpoi", Blocks.ANVIL);
        public static final VillagerProfession BUSINESSMAN = registerProfession("businessman", BUSINESS_MAN);

        public static VillagerProfession registerProfession(String name, PointOfInterestType type) {
            return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Expensive.MOD_ID, name),
                    VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                            SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));
        }

        public static PointOfInterestType registerPOI(String name, Block block) {
            return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(Expensive.MOD_ID, name),
                    PointOfInterestTypeAccessor.callCreate(name,
                            ImmutableSet.copyOf(block.getStateManager().getStates()),
                            1, 1));
        }

        public static void setupPOIs() {
            PointOfInterestTypeAccessor.callSetup(BUSINESS_MAN);
        }
}
