package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.GP5Model;
import net.marblednull.marbledsarsenal.init.ArmorItems.WhiteGP5ArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GP5Renderer extends GeoArmorRenderer<WhiteGP5ArmorItem> {
    public GP5Renderer() {
        super(new GP5Model());
    }
}
