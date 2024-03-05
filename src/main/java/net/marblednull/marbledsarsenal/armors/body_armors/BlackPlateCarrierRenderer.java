package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackPlateCarrierRenderer extends GeoArmorRenderer<BlackPlateCarrierArmorItem> {
    public BlackPlateCarrierRenderer() {
        super(new BlackPlateCarrierModel());
    }
}
