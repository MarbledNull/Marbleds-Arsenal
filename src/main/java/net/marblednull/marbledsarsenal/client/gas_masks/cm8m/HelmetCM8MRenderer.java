package net.marblednull.marbledsarsenal.client.gas_masks.cm8m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.HelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HelmetCM8MRenderer extends GeoArmorRenderer<HelmetCM8MArmorItem> {
    public HelmetCM8MRenderer() {
        super(new HelmetCM8MModel());
    }
}
