package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BirchGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BirchGhillieArmorRenderer extends GeoArmorRenderer<BirchGhillieArmorItem> {
    public BirchGhillieArmorRenderer() {
        super(new BirchGhillieArmorModel());
    }
}
