package net.marblednull.marbledsarsenal.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        //makeShield(ModItems.HEAVY_RIOT_SHIELD.get());
        //makeShield(ModItems.RIOT_SHIELD.get());
    }

    private static void makeShield(Item item) {
        ItemModelsProperties.register(Items.SHIELD, new ResourceLocation("blocking"), (p_239421_0_, p_239421_1_, p_239421_2_) -> {
            return p_239421_2_ != null && p_239421_2_.isUsingItem() && p_239421_2_.getUseItem() == p_239421_0_ ? 1.0F : 0.0F;
        });
    }
}