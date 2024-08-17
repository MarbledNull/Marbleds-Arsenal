package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatArmorRenderer extends GeoArmorRenderer<HazmatArmorItem> {
    public HazmatArmorRenderer() {
        super(new HazmatArmorModel());
    }
}
