package net.marblednull.marbledsarsenal.armors.helmets.beret;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNMilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNMilitaryBeretRenderer extends GeoArmorRenderer<UNMilitaryBeretArmorItem> {
    public UNMilitaryBeretRenderer() {
        super(new UNMilitaryBeretModel());
    }
}
