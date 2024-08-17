package net.marblednull.marbledsarsenal.client.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.SpruceGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SpruceGhillieArmorRenderer extends GeoArmorRenderer<SpruceGhillieArmorItem> {
    public SpruceGhillieArmorRenderer() {
        super(new SpruceGhillieArmorModel());
    }
}
