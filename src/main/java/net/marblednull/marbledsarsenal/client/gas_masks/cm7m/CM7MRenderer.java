package net.marblednull.marbledsarsenal.client.gas_masks.cm7m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.CM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CM7MRenderer extends GeoArmorRenderer<CM7MArmorItem> {
    public CM7MRenderer() {
        super(new CM7MModel());
    }
}
