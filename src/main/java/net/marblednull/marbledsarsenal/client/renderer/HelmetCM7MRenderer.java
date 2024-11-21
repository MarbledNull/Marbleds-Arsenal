package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HelmetCM7MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.HelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HelmetCM7MRenderer extends GeoArmorRenderer<HelmetCM7MArmorItem> {
    public HelmetCM7MRenderer() {
        super(new HelmetCM7MModel());
    }
}