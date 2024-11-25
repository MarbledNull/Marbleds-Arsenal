package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.DesertMilitaryArmorModel;
import net.marblednull.marbledsarsenal.client.model.WoodlandMilitaryArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.DesertMilitaryArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.WoodlandMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WoodlandMilitaryArmorRenderer extends GeoArmorRenderer<WoodlandMilitaryArmorItem> {
    public WoodlandMilitaryArmorRenderer() {
        super(new WoodlandMilitaryArmorModel());
    }
}
