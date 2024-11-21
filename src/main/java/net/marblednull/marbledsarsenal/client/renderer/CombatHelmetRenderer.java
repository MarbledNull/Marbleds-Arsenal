package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CombatHelmetModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CombatHelmetRenderer extends GeoArmorRenderer<CombatHelmetArmorItem> {
    public CombatHelmetRenderer() {
        super(new CombatHelmetModel());
    }
}
