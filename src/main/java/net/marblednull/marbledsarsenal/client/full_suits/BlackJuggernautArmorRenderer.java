package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackJuggernautArmorRenderer extends GeoArmorRenderer<BlackJuggernautArmorItem> {
    public BlackJuggernautArmorRenderer() {
        super(new BlackJuggernautArmorModel());
    }
}
