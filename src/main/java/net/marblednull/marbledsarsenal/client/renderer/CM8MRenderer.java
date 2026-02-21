package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM8MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.CM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CM8MRenderer extends GeoArmorRenderer<CM8MArmorItem> {
    public CM8MRenderer() {
        super(new CM8MModel());
    }
}
