package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AcaciaGhillieArmorRenderer extends GeoArmorRenderer<AcaciaGhillieArmorItem> {
    public AcaciaGhillieArmorRenderer() {
        super(new AcaciaGhillieArmorModel());
    }
}
