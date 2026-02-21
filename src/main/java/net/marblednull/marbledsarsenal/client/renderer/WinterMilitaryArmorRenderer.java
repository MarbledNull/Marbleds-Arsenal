package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.WinterMilitaryArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.WinterMilitaryArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WinterMilitaryArmorRenderer extends GeoArmorRenderer<WinterMilitaryArmorItem> {
    public WinterMilitaryArmorRenderer() {
        super(new WinterMilitaryArmorModel());
    }
}
