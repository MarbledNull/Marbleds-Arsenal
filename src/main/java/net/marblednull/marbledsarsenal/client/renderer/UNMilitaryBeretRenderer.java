package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNMilitaryBeretModel;
import net.marblednull.marbledsarsenal.init.item.UNMilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNMilitaryBeretRenderer extends GeoArmorRenderer<UNMilitaryBeretArmorItem> {
    public UNMilitaryBeretRenderer() {
        super(new UNMilitaryBeretModel());
    }
}
