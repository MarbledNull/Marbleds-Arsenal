package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CM6MRenderer extends GeoArmorRenderer<CM6MArmorItem> {
    public CM6MRenderer() {
        super(new CM6MModel());
    }
}
