package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.OakGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BirchGhillieArmorRenderer extends GeoArmorRenderer<BirchGhillieArmorItem> {
    public BirchGhillieArmorRenderer() {
        super(new BirchGhillieArmorModel());
    }
}
