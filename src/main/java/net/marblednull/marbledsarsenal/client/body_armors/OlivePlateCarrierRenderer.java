package net.marblednull.marbledsarsenal.client.body_armors;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OlivePlateCarrierRenderer extends GeoArmorRenderer<OlivePlateCarrierArmorItem> {
    public OlivePlateCarrierRenderer() {
        super(new OlivePlateCarrierModel());
    }
}
