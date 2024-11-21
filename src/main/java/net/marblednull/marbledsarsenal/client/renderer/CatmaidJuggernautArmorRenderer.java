package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CatmaidJuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.CatmaidJuggernautArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CatmaidJuggernautArmorRenderer extends GeoArmorRenderer<CatmaidJuggernautArmorItem> {
    public CatmaidJuggernautArmorRenderer() {
        super(new CatmaidJuggernautArmorModel());
    }
}
