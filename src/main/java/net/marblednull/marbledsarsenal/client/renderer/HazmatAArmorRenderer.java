package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HazmatAArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.HazmatAArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatAArmorRenderer extends GeoArmorRenderer<HazmatAArmorItem> {
    public HazmatAArmorRenderer() {
        super(new HazmatAArmorModel());
    }
}
