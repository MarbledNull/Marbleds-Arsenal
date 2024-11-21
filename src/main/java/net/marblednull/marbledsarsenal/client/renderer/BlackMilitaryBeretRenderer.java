package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackMilitaryBeretModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.BlackMilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackMilitaryBeretRenderer extends GeoArmorRenderer<BlackMilitaryBeretArmorItem> {
    public BlackMilitaryBeretRenderer() {
        super(new BlackMilitaryBeretModel());
    }
}
