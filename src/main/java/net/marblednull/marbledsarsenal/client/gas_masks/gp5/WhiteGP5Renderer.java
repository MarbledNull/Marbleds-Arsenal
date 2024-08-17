package net.marblednull.marbledsarsenal.client.gas_masks.gp5;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WhiteGP5Renderer extends GeoArmorRenderer<WhiteGP5ArmorItem> {
    public WhiteGP5Renderer() {
        super(new WhiteGP5Model());
    }
}
