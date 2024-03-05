package net.marblednull.marbledsarsenal.armors.helmets.beret;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.BlackMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackMilitaryBeretRenderer extends GeoArmorRenderer<BlackMilitaryBeretArmorItem> {
    public BlackMilitaryBeretRenderer() {
        super(new BlackMilitaryBeretModel());
    }
}
