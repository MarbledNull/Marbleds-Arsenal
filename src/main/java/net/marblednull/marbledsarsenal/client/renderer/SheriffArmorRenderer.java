package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.PoliceArmorModel;
import net.marblednull.marbledsarsenal.client.model.SheriffArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.PoliceArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.SheriffArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SheriffArmorRenderer extends GeoArmorRenderer<SheriffArmorItem> {
    public SheriffArmorRenderer() {
        super(new SheriffArmorModel());
    }
}
