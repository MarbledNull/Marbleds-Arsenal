package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WinterMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WinterMilitaryArmorRenderer extends GeoArmorRenderer<WinterMilitaryArmorItem> {
    public WinterMilitaryArmorRenderer() {
        super(new WinterMilitaryArmorModel());
    }
}
