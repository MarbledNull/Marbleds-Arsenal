package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HazmatBArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.HazmatBArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatBArmorRenderer extends GeoArmorRenderer<HazmatBArmorItem> {
    public HazmatBArmorRenderer() {
        super(new HazmatBArmorModel());
    }
}
