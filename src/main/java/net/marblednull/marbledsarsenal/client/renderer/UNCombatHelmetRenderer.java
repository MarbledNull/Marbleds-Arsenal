package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNCombatHelmetModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNCombatHelmetRenderer extends GeoArmorRenderer<UNCombatHelmetArmorItem> {
    public UNCombatHelmetRenderer() {
        super(new UNCombatHelmetModel());
    }
}
