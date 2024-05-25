package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AzaleaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.FloweringAzeleaGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FloweringAzaleaGhillieArmorRenderer extends GeoArmorRenderer<FloweringAzeleaGhillieArmorItem> {
    public FloweringAzaleaGhillieArmorRenderer() {
        super(new FloweringAzaleaGhillieArmorModel());
    }
}
