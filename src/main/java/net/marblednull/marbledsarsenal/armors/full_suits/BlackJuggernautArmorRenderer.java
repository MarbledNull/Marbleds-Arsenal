package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.OliveJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackJuggernautArmorRenderer extends GeoArmorRenderer<BlackJuggernautArmorItem> {
    public BlackJuggernautArmorRenderer() {
        super(new BlackJuggernautArmorModel());
    }
}
