package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CherryGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.CherryGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CherryGhillieArmorRenderer extends GeoArmorRenderer<CherryGhillieArmorItem> {
    public CherryGhillieArmorRenderer() {
        super(new CherryGhillieArmorModel());
    }
}
