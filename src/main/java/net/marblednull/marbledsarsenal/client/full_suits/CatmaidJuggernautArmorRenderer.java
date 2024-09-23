package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.CatmaidJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CatmaidJuggernautArmorRenderer extends GeoArmorRenderer<CatmaidJuggernautArmorItem> {
    public CatmaidJuggernautArmorRenderer() {
        super(new CatmaidJuggernautArmorModel());
    }
}
