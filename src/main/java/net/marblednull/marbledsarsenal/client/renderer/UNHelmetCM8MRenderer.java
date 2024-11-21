package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNHelmetCM8MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.UNHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNHelmetCM8MRenderer extends GeoArmorRenderer<UNHelmetCM8MArmorItem> {
    public UNHelmetCM8MRenderer() {
        super(new UNHelmetCM8MModel());
    }
}
