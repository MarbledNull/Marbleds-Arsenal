package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarbledsArsenal.MODID);

    public static final RegistryObject<CreativeModeTab> MARBLEDS_ARSENAL = TABS.register("marbleds_arsenal",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.marbleds_arsenal"))
                    .icon(() -> new ItemStack(ModItems.CM6M_GAS_MASK.get()))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.CM6M_GAS_MASK.get());
                        output.accept(ModItems.HELMET_CM6M_GAS_MASK.get());
                        output.accept(ModItems.UN_HELMET_CM6M_GAS_MASK.get());
                        output.accept(ModItems.OLIVE_HELMET_CM6M_GAS_MASK.get());

                        output.accept(ModItems.CM7M_GAS_MASK.get());
                        output.accept(ModItems.HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.UN_HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.OLIVE_HELMET_CM7M_GAS_MASK.get());

                        output.accept(ModItems.CM8M_GAS_MASK.get());
                        output.accept(ModItems.HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.UN_HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.OLIVE_HELMET_CM8M_GAS_MASK.get());

                        output.accept(ModItems.WHITE_GP5_GAS_MASK.get());
                        output.accept(ModItems.BLACK_GP5_GAS_MASK.get());

                        output.accept(ModItems.COMBAT_HELMET.get());
                        output.accept(ModItems.UN_COMBAT_HELMET.get());
                        output.accept(ModItems.OLIVE_COMBAT_HELMET.get());

                        output.accept(ModItems.BLACK_MILITARY_BERET.get());
                        output.accept(ModItems.RED_MILITARY_BERET.get());
                        output.accept(ModItems.UN_MILITARY_BERET.get());

                        output.accept(ModItems.BLACK_PLATE_CARRIER_LIGHT.get());
                        output.accept(ModItems.BLACK_PLATE_CARRIER_HEAVY.get());

                        output.accept(ModItems.OLIVE_PLATE_CARRIER_LIGHT.get());
                        output.accept(ModItems.OLIVE_PLATE_CARRIER_HEAVY.get());

                        output.accept(ModItems.RIOT_HELMET.get());
                        output.accept(ModItems.RIOT_CHESTPLATE.get());
                        output.accept(ModItems.RIOT_LEGGINGS.get());
                        output.accept(ModItems.RIOT_BOOTS.get());

                        output.accept(ModItems.SWAT_HELMET.get());
                        output.accept(ModItems.SWAT_CHESTPLATE.get());
                        output.accept(ModItems.SWAT_LEGGINGS.get());
                        output.accept(ModItems.SWAT_BOOTS.get());

                        output.accept(ModItems.WINTER_MILITARY_HELMET.get());
                        output.accept(ModItems.WINTER_MILITARY_CHESTPLATE.get());
                        output.accept(ModItems.WINTER_MILITARY_LEGGINGS.get());
                        output.accept(ModItems.WINTER_MILITARY_BOOTS.get());

                        output.accept(ModItems.DESERT_MILITARY_HELMET.get());
                        output.accept(ModItems.DESERT_MILITARY_CHESTPLATE.get());
                        output.accept(ModItems.DESERT_MILITARY_LEGGINGS.get());
                        output.accept(ModItems.DESERT_MILITARY_BOOTS.get());

                        output.accept(ModItems.HAZMAT_HELMET.get());
                        output.accept(ModItems.HAZMAT_CHESTPLATE.get());
                        output.accept(ModItems.HAZMAT_LEGGINGS.get());
                        output.accept(ModItems.HAZMAT_BOOTS.get());

                        output.accept(ModItems.OLIVE_JUGGERNAUT_HELMET.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_CHESTPLATE.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_LEGGINGS.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_BOOTS.get());

                        output.accept(ModItems.BLACK_JUGGERNAUT_HELMET.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_CHESTPLATE.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_LEGGINGS.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_BOOTS.get());

                        output.accept(ModItems.OAK_GHILLIE_HELMET.get());
                        output.accept(ModItems.OAK_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.OAK_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.OAK_GHILLIE_BOOTS.get());

                        output.accept(ModItems.SPRUCE_GHILLIE_HELMET.get());
                        output.accept(ModItems.SPRUCE_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.SPRUCE_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.SPRUCE_GHILLIE_BOOTS.get());

                        output.accept(ModItems.BIRCH_GHILLIE_HELMET.get());
                        output.accept(ModItems.BIRCH_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.BIRCH_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.BIRCH_GHILLIE_BOOTS.get());

                        output.accept(ModItems.JUNGLE_GHILLIE_HELMET.get());
                        output.accept(ModItems.JUNGLE_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.JUNGLE_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.JUNGLE_GHILLIE_BOOTS.get());

                        output.accept(ModItems.ACACIA_GHILLIE_HELMET.get());
                        output.accept(ModItems.ACACIA_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.ACACIA_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.ACACIA_GHILLIE_BOOTS.get());

                        output.accept(ModItems.DARK_OAK_GHILLIE_HELMET.get());
                        output.accept(ModItems.DARK_OAK_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.DARK_OAK_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.DARK_OAK_GHILLIE_BOOTS.get());

                        output.accept(ModItems.MANGROVE_GHILLIE_HELMET.get());
                        output.accept(ModItems.MANGROVE_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.MANGROVE_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.MANGROVE_GHILLIE_BOOTS.get());

                        output.accept(ModItems.CHERRY_GHILLIE_HELMET.get());
                        output.accept(ModItems.CHERRY_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.CHERRY_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.CHERRY_GHILLIE_BOOTS.get());

                        output.accept(ModItems.AZALEA_GHILLIE_HELMET.get());
                        output.accept(ModItems.AZALEA_GHILLIE_CHESTPLATE.get());
                        output.accept(ModItems.AZALEA_GHILLIE_LEGGINGS.get());
                        output.accept(ModItems.AZALEA_GHILLIE_BOOTS.get());

                        output.accept(ModItems.GAS_MASK_FILTER.get());
                        output.accept(ModItems.ARMOR_PLATE.get());
                        output.accept(ModItems.KEVLAR_THREAD.get());
                        output.accept(ModItems.KEVLAR.get());
                        output.accept(ModItems.RUBBER.get());

                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}