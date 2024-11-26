package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BirchGhillieArmorModel;
import net.marblednull.marbledsarsenal.client.model.PoliceArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.PoliceArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PoliceArmorRenderer extends GeoArmorRenderer<PoliceArmorItem> {
    public PoliceArmorRenderer() {
        super(new PoliceArmorModel());
    }
}
