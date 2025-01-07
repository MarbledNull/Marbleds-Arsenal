package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.AzaleaGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.AzaleaGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AzaleaGhillieArmorRenderer extends GeoArmorRenderer<AzaleaGhillieArmorItem> {
    public AzaleaGhillieArmorRenderer() {
        super(new AzaleaGhillieArmorModel());
    }
}
