package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.JuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.JuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JuggernautArmorRenderer extends GeoArmorRenderer<JuggernautArmorItem> {
    public JuggernautArmorRenderer() {
        super(new JuggernautArmorModel());
    }
}
