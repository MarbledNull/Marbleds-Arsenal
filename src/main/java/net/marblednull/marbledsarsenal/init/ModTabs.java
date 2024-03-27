package net.marblednull.marbledsarsenal.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModTabs {
    public static final ItemGroup MARBLEDS_ARSENAL = new ItemGroup("marbleds_arsenal") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CM6M_GAS_MASK.get());
        }
    };

    public static final ItemGroup MARBLEDS_ARSENAL_EXTRAS = new ItemGroup("marbleds_arsenal_extras") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.BARRIER.getItem());
        }
    };

}
