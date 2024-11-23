package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveHelmetCM8MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.OliveHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveHelmetCM8MRenderer extends GeoArmorRenderer<OliveHelmetCM8MArmorItem> {
    public OliveHelmetCM8MRenderer() {
        super(new OliveHelmetCM8MModel());
    }
}
