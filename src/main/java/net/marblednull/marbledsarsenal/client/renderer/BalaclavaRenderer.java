package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BalaclavaModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.BalaclavaArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BalaclavaRenderer extends GeoArmorRenderer<BalaclavaArmorItem> {
    public BalaclavaRenderer() {
        super(new BalaclavaModel());
    }
}
