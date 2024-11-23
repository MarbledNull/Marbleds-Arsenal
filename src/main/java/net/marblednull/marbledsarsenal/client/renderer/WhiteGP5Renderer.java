package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.WhiteGP5Model;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.WhiteGP5ArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WhiteGP5Renderer extends GeoArmorRenderer<WhiteGP5ArmorItem> {
    public WhiteGP5Renderer() {
        super(new WhiteGP5Model());
    }
}
