package net.marblednull.marbledsarsenal.client.body_armors;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.object.Color;
import software.bernie.geckolib.renderer.DyeableGeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackPlateCarrierRenderer extends GeoArmorRenderer<BlackPlateCarrierArmorItem> {
    public BlackPlateCarrierRenderer() {
        super(new BlackPlateCarrierModel());
    }
}
