package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CMI01Model;
import net.marblednull.marbledsarsenal.init.ArmorItems.CMI01ArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CMI01Renderer extends GeoArmorRenderer<CMI01ArmorItem> {
    public CMI01Renderer() {
        super(new CMI01Model());
    }
}
