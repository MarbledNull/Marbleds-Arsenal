package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM7MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.CM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CM7MRenderer extends GeoArmorRenderer<CM7MArmorItem> {
    public CM7MRenderer() {
        super(new CM7MModel());
    }
}
