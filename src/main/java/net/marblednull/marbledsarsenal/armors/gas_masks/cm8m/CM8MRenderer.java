package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.CM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CM8MRenderer extends GeoArmorRenderer<CM8MArmorItem> {
    public CM8MRenderer() {
        super(new CM8MModel());
    }
}
