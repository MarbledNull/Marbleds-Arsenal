package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HelmetCM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.HelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HelmetCM6MRenderer extends GeoArmorRenderer<HelmetCM6MArmorItem> {
    public HelmetCM6MRenderer() {
        super(new HelmetCM6MModel());
    }
}
