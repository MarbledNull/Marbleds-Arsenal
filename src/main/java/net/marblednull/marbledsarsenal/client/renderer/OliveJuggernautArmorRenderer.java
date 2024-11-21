package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveJuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveJuggernautArmorRenderer extends GeoArmorRenderer<OliveJuggernautArmorItem> {
    public OliveJuggernautArmorRenderer() {
        super(new OliveJuggernautArmorModel());
    }
}
