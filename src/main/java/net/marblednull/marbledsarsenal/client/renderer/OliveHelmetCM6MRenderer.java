package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveHelmetCM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.OliveHelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveHelmetCM6MRenderer extends GeoArmorRenderer<OliveHelmetCM6MArmorItem> {
    public OliveHelmetCM6MRenderer() {
        super(new OliveHelmetCM6MModel());
    }
}
