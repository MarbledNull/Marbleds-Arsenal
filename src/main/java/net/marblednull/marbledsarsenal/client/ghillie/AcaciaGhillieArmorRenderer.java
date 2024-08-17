package net.marblednull.marbledsarsenal.client.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AcaciaGhillieArmorRenderer extends GeoArmorRenderer<AcaciaGhillieArmorItem> {
    public AcaciaGhillieArmorRenderer() {
        super(new AcaciaGhillieArmorModel());
    }
}
