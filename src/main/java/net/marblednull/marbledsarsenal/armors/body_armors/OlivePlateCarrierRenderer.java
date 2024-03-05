package net.marblednull.marbledsarsenal.armors.body_armors;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OlivePlateCarrierRenderer extends GeoArmorRenderer<OlivePlateCarrierArmorItem> {
    public OlivePlateCarrierRenderer() {
        super(new OlivePlateCarrierModel());
    }
}
