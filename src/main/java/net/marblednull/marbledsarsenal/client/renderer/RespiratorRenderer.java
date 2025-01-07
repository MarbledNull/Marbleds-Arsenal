package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.RespiratorArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.RespiratorArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RespiratorRenderer extends GeoArmorRenderer<RespiratorArmorItem> {
    public RespiratorRenderer() {
        super(new RespiratorArmorModel());
    }
}
