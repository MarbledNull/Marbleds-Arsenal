package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.HelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HelmetCM7MRenderer extends GeoArmorRenderer<HelmetCM7MArmorItem> {
    public HelmetCM7MRenderer() {
        super(new HelmetCM7MModel());
    }
}