package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackPlateCarrierRenderer extends GeoArmorRenderer<BlackPlateCarrierArmorItem> {
    public BlackPlateCarrierRenderer() {
        super(new CombatHelmetModel.BlackPlateCarrierModel());
    }
}
