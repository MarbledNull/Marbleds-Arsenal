package net.marblednull.marbledsarsenal.client.helmets;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class UNCombatHelmetRenderer extends GeoArmorRenderer<UNCombatHelmetArmorItem> {
    public UNCombatHelmetRenderer() {
        super(new UNCombatHelmetModel());
    }
}
