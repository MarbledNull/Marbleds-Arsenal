package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OakGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.item.OakGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OakGhillieArmorRenderer extends GeoArmorRenderer<OakGhillieArmorItem> {
    public OakGhillieArmorRenderer() {
        super(new OakGhillieArmorModel());
    }
}
