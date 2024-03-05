package net.marblednull.marbledsarsenal.armors.gas_masks.gp5;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BlackGP5Renderer extends GeoArmorRenderer<BlackGP5ArmorItem> {
    public BlackGP5Renderer() {
        super(new BlackGP5Model());
    }
}
