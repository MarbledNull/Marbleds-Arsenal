package net.marblednull.marbledsarsenal.client.full_suits;

import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.DesertMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DesertMilitaryArmorRenderer extends GeoArmorRenderer<DesertMilitaryArmorItem> {
    public DesertMilitaryArmorRenderer() {
        super(new DesertMilitaryArmorModel());
    }
}
