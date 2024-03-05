package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.UNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.UNHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNHelmetCM8MRenderer extends GeoArmorRenderer<UNHelmetCM8MArmorItem> {
    public UNHelmetCM8MRenderer() {
        super(new UNHelmetCM8MModel());
    }
}
