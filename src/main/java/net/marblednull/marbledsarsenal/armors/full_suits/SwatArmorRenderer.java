package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.SwatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SwatArmorRenderer extends GeoArmorRenderer<SwatArmorItem> {
    public SwatArmorRenderer() {
        super(new SwatArmorModel());
    }
}
