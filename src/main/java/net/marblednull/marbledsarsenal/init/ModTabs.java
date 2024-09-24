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
                        output.accept(ModItems.MEDICAL_HELMET_CM6M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_UN_HELMET_CM6M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK.get());

                        output.accept(ModItems.CM7M_GAS_MASK.get());
                        output.accept(ModItems.HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.UN_HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.OLIVE_HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_UN_HELMET_CM7M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK.get());

                        output.accept(ModItems.CM8M_GAS_MASK.get());
                        output.accept(ModItems.HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.UN_HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.OLIVE_HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_UN_HELMET_CM8M_GAS_MASK.get());
                        output.accept(ModItems.MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK.get());

                        output.accept(ModItems.WHITE_GP5_GAS_MASK.get());
                        output.accept(ModItems.BLACK_GP5_GAS_MASK.get());

                        output.accept(ModItems.COMBAT_HELMET.get());
                        output.accept(ModItems.UN_COMBAT_HELMET.get());
                        output.accept(ModItems.OLIVE_COMBAT_HELMET.get());
                        output.accept(ModItems.MEDICAL_COMBAT_HELMET.get());
                        output.accept(ModItems.MEDICAL_UN_COMBAT_HELMET.get());
                        output.accept(ModItems.MEDICAL_OLIVE_COMBAT_HELMET.get());

                        output.accept(ModItems.BLACK_MILITARY_BERET.get());
                        output.accept(ModItems.RED_MILITARY_BERET.get());
                        output.accept(ModItems.UN_MILITARY_BERET.get());

                        output.accept(ModItems.BLACK_PLATE_CARRIER_LIGHT.get());
                        output.accept(ModItems.BLACK_PLATE_CARRIER_HEAVY.get());

                        output.accept(ModItems.OLIVE_PLATE_CARRIER_LIGHT.get());
                        output.accept(ModItems.OLIVE_PLATE_CARRIER_HEAVY.get());

                        output.accept(ModItems.RIOT_ARMOR_HELMET.get());
                        output.accept(ModItems.RIOT_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.RIOT_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.RIOT_ARMOR_BOOTS.get());

                        output.accept(ModItems.SWAT_ARMOR_HELMET.get());
                        output.accept(ModItems.SWAT_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.SWAT_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.SWAT_ARMOR_BOOTS.get());

                        output.accept(ModItems.WINTER_MILITARY_ARMOR_HELMET.get());
                        output.accept(ModItems.WINTER_MILITARY_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.WINTER_MILITARY_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.WINTER_MILITARY_ARMOR_BOOTS.get());

                        output.accept(ModItems.DESERT_MILITARY_ARMOR_HELMET.get());
                        output.accept(ModItems.DESERT_MILITARY_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.DESERT_MILITARY_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.DESERT_MILITARY_ARMOR_BOOTS.get());

                        output.accept(ModItems.HAZMAT_ARMOR_HELMET.get());
                        output.accept(ModItems.HAZMAT_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.HAZMAT_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.HAZMAT_ARMOR_BOOTS.get());

                        output.accept(ModItems.OLIVE_JUGGERNAUT_ARMOR_HELMET.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.OLIVE_JUGGERNAUT_ARMOR_BOOTS.get());

                        output.accept(ModItems.BLACK_JUGGERNAUT_ARMOR_HELMET.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_ARMOR_CHESTPLATE.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_ARMOR_LEGGINGS.get());
                        output.accept(ModItems.BLACK_JUGGERNAUT_ARMOR_BOOTS.get());

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

                        output.accept(ModItems.CROWBAR.get());
                        output.accept(ModItems.FIRE_AXE.get());
                        output.accept(ModItems.MODERN_AXE.get());
                        output.accept(ModItems.TOMAHAWK.get());
                        output.accept(ModItems.PIPE_WRENCH.get());
                        output.accept(ModItems.SLEDGEHAMMER.get());
                        output.accept(ModItems.BONE_SAW.get());
                        output.accept(ModItems.POLICE_BATON.get());
                        output.accept(ModItems.MACHETE.get());
                        output.accept(ModItems.STOP_SIGN.get());
                        output.accept(ModItems.KATANA.get());
                        output.accept(ModItems.TANTO.get());
                        output.accept(ModItems.BASEBALL_BAT.get());
                        output.accept(ModItems.BARBED_BASEBALL_BAT.get());
                        output.accept(ModItems.STEEL_BASEBALL_BAT.get());

                        output.accept(ModItems.GAS_MASK_FILTER.get());
                        output.accept(ModItems.ARMOR_PLATE.get());
                        output.accept(ModItems.RUBBER.get());

                    })
                    .build()
    );

    //public static final RegistryObject<CreativeModeTab> MARBLEDS_ARSENAL_EXTRAS = TABS.register("marbleds_arsenal_extras",
    //() -> CreativeModeTab.builder()
    //.title(Component.translatable("itemGroup.marbleds_arsenal_extras"))
    //.icon(() -> new ItemStack(Items.BARRIER.asItem()))
    //.displayItems((displayParameters, output) -> {
    //})
    // .build()
    //);
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}