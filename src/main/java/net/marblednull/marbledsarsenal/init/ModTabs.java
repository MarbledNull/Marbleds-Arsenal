package net.marblednull.marbledsarsenal.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModTabs {
    public static final CreativeModeTab MARBLEDS_ARSENAL = new CreativeModeTab("marbleds_arsenal") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CM6M_GAS_MASK.get());
        }
    };
}