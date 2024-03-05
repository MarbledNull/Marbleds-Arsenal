package net.marblednull.marbledsarsenal.armors.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.DesertMilitaryArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WinterMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DesertMilitaryArmorRenderer extends GeoArmorRenderer<DesertMilitaryArmorItem> {
    public DesertMilitaryArmorRenderer() {
        super(new DesertMilitaryArmorModel());
    }
}
