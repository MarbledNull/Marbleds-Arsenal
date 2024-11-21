package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.RiotArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RiotArmorRenderer extends GeoArmorRenderer<RiotArmorItem> {
    public RiotArmorRenderer() {
        super(new RiotArmorModel());
    }
}
