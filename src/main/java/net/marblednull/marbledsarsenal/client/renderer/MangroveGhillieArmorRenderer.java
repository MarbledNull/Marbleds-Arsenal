package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.MangroveGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.MangroveGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MangroveGhillieArmorRenderer extends GeoArmorRenderer<MangroveGhillieArmorItem> {
    public MangroveGhillieArmorRenderer() {
        super(new MangroveGhillieArmorModel());
    }
}
