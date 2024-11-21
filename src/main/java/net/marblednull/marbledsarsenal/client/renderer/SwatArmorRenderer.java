package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.SwatArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.SwatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SwatArmorRenderer extends GeoArmorRenderer<SwatArmorItem> {
    public SwatArmorRenderer() {
        super(new SwatArmorModel());
    }
}
