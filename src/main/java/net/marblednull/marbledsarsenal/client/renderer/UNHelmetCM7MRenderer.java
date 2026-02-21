package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNHelmetCM7MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNHelmetCM7MRenderer extends GeoArmorRenderer<UNHelmetCM7MArmorItem> {
    public UNHelmetCM7MRenderer() {
        super(new UNHelmetCM7MModel());
    }
}
