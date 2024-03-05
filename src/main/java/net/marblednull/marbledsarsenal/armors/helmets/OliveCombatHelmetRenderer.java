package net.marblednull.marbledsarsenal.armors.helmets;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveCombatHelmetRenderer extends GeoArmorRenderer<OliveCombatHelmetArmorItem> {
    public OliveCombatHelmetRenderer() {
        super(new OliveCombatHelmetModel());
    }
}
