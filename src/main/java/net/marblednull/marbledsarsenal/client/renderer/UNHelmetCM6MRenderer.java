package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNHelmetCM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.UNHelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNHelmetCM6MRenderer extends GeoArmorRenderer<UNHelmetCM6MArmorItem> {
    public UNHelmetCM6MRenderer() {
        super(new UNHelmetCM6MModel());
    }
}
