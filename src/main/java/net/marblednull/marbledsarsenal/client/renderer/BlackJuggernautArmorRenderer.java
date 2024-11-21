package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackJuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackJuggernautArmorRenderer extends GeoArmorRenderer<BlackJuggernautArmorItem> {
    public BlackJuggernautArmorRenderer() {
        super(new BlackJuggernautArmorModel());
    }
}
