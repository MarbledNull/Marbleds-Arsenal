package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatArmorRenderer extends GeoArmorRenderer<HazmatArmorItem> {
    public HazmatArmorRenderer() {
        super(new HazmatArmorModel());
    }
}
