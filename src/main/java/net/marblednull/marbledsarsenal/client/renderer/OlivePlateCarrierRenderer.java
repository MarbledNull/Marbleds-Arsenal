package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OlivePlateCarrierModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.OlivePlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OlivePlateCarrierRenderer extends GeoArmorRenderer<OlivePlateCarrierArmorItem> {
    public OlivePlateCarrierRenderer() {
        super(new OlivePlateCarrierModel());
    }
}
