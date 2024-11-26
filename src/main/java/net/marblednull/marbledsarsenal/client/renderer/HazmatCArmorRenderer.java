package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HazmatBArmorModel;
import net.marblednull.marbledsarsenal.client.model.HazmatCArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatAArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.HazmatCArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HazmatCArmorRenderer extends GeoArmorRenderer<HazmatCArmorItem> {
    public HazmatCArmorRenderer() {
        super(new HazmatCArmorModel());
    }
}
