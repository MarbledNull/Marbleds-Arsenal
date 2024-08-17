package net.marblednull.marbledsarsenal.client.helmets.beret;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.RedMilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RedMilitaryBeretRenderer extends GeoArmorRenderer<RedMilitaryBeretArmorItem> {
    public RedMilitaryBeretRenderer() {
        super(new RedMilitaryBeretModel());
    }
}
