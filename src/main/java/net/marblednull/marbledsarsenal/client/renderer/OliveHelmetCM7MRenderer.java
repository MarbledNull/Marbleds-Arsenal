package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveHelmetCM7MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.OliveHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveHelmetCM7MRenderer extends GeoArmorRenderer<OliveHelmetCM7MArmorItem> {
    public OliveHelmetCM7MRenderer() {
        super(new OliveHelmetCM7MModel());
    }
}
