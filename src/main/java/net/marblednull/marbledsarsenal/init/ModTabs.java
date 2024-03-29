package net.marblednull.marbledsarsenal.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModTabs {

    public static final net.minecraft.world.item.CreativeModeTab MARBLEDS_ARSENAL =
            new net.minecraft.world.item.CreativeModeTab("marbleds_arsenal") {
                @Override
                public ItemStack makeIcon() {
                    return new ItemStack(ModItems.CM6M_GAS_MASK.get());
                }
            };
    public static final net.minecraft.world.item.CreativeModeTab MARBLEDS_ARSENAL_EXTRAS =
            new net.minecraft.world.item.CreativeModeTab("marbleds_arsenal_extras") {
                @Override
                public ItemStack makeIcon() {
                    return new ItemStack(Items.BARRIER.asItem());
                }
            };
}