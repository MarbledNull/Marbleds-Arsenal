package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.CherryGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CherryGhillieArmorRenderer extends GeoArmorRenderer<CherryGhillieArmorItem> {
    public CherryGhillieArmorRenderer() {
        super(new CherryGhillieArmorModel());
    }
}
