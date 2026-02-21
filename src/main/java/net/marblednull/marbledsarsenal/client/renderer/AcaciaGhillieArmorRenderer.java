package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.AcaciaGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.AcaciaGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AcaciaGhillieArmorRenderer extends GeoArmorRenderer<AcaciaGhillieArmorItem> {
    public AcaciaGhillieArmorRenderer() {
        super(new AcaciaGhillieArmorModel());
    }
}
