package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.client.model.PlateCarrierModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.PlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PlateCarrierRenderer extends GeoArmorRenderer<PlateCarrierArmorItem> {
    public PlateCarrierRenderer() {
        super(new PlateCarrierModel());
    }
}
