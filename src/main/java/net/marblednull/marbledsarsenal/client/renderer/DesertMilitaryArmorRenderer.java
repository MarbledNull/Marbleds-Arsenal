package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.DesertMilitaryArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.DesertMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DesertMilitaryArmorRenderer extends GeoArmorRenderer<DesertMilitaryArmorItem> {
    public DesertMilitaryArmorRenderer() {
        super(new DesertMilitaryArmorModel());
    }
}
