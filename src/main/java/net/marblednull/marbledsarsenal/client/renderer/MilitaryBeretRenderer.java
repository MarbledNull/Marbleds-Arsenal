package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.MilitaryBeretModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.MilitaryBeretArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MilitaryBeretRenderer extends GeoArmorRenderer<MilitaryBeretArmorItem> {
    public MilitaryBeretRenderer() {
        super(new MilitaryBeretModel());
    }
}
