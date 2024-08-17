package net.marblednull.marbledsarsenal.client.helmets.beret;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.BlackMilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackMilitaryBeretRenderer extends GeoArmorRenderer<BlackMilitaryBeretArmorItem> {
    public BlackMilitaryBeretRenderer() {
        super(new BlackMilitaryBeretModel());
    }
}
