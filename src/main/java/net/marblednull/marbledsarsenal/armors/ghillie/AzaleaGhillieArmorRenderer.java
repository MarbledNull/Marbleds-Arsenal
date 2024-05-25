package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AzaleaGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AzaleaGhillieArmorRenderer extends GeoArmorRenderer<AzaleaGhillieArmorItem> {
    public AzaleaGhillieArmorRenderer() {
        super(new AzaleaGhillieArmorModel());
    }
}
