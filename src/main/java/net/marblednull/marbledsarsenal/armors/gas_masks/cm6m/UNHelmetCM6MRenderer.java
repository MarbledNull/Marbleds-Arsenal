package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.UNHelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNHelmetCM6MRenderer extends GeoArmorRenderer<UNHelmetCM6MArmorItem> {
    public UNHelmetCM6MRenderer() {
        super(new UNHelmetCM6MModel());
    }
}
