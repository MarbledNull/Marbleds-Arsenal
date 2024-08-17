package net.marblednull.marbledsarsenal.client.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.JungleGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JungleGhillieArmorRenderer extends GeoArmorRenderer<JungleGhillieArmorItem> {
    public JungleGhillieArmorRenderer() {
        super(new JungleGhillieArmorModel());
    }
}
