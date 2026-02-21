package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.JungleGhillieArmorModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.JungleGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JungleGhillieArmorRenderer extends GeoArmorRenderer<JungleGhillieArmorItem> {
    public JungleGhillieArmorRenderer() {
        super(new JungleGhillieArmorModel());
    }
}
