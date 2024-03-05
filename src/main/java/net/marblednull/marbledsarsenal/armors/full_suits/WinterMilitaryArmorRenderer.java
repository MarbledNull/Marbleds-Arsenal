package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.RiotArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WinterMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WinterMilitaryArmorRenderer extends GeoArmorRenderer<WinterMilitaryArmorItem> {
    public WinterMilitaryArmorRenderer() {
        super(new WinterMilitaryArmorModel());
    }
}
