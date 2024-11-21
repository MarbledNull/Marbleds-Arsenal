package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveCombatHelmetModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.OliveCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class OliveCombatHelmetRenderer extends GeoArmorRenderer<OliveCombatHelmetArmorItem> {
    public OliveCombatHelmetRenderer() {
        super(new OliveCombatHelmetModel());
    }
}
