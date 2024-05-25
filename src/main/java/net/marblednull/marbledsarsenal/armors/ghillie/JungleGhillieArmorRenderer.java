package net.marblednull.marbledsarsenal.armors.ghillie;

import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.BirchGhillieArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.ghillies.JungleGhillieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JungleGhillieArmorRenderer extends GeoArmorRenderer<JungleGhillieArmorItem> {
    public JungleGhillieArmorRenderer() {
        super(new JungleGhillieArmorModel());
    }
}
