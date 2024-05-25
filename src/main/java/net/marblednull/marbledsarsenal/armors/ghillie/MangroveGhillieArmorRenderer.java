package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.AcaciaGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.MangroveGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MangroveGhillieArmorRenderer extends GeoArmorRenderer<MangroveGhillieArmorItem> {
    public MangroveGhillieArmorRenderer() {
        super(new MangroveGhillieArmorModel());
    }
}
