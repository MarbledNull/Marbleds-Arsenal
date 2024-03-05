package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveJuggernautArmorRenderer extends GeoArmorRenderer<OliveJuggernautArmorItem> {
    public OliveJuggernautArmorRenderer() {
        super(new OliveJuggernautArmorModel());
    }
}
