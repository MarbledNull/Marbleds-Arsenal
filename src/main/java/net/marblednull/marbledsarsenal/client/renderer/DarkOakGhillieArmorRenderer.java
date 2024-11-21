package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.DarkOakGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.DarkOakGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DarkOakGhillieArmorRenderer extends GeoArmorRenderer<DarkOakGhillieArmorItem> {
    public DarkOakGhillieArmorRenderer() {
        super(new DarkOakGhillieArmorModel());
    }
}
