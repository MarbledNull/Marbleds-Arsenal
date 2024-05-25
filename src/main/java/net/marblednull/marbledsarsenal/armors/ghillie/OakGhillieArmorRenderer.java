package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.BlackJuggernautArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.OakGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OakGhillieArmorRenderer extends GeoArmorRenderer<OakGhillieArmorItem> {
    public OakGhillieArmorRenderer() {
        super(new OakGhillieArmorModel());
    }
}
