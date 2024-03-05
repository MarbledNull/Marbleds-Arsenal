package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RiotArmorRenderer extends GeoArmorRenderer<RiotArmorItem> {
    public RiotArmorRenderer() {
        super(new RiotArmorModel());
    }
}
