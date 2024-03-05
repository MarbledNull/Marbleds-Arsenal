package net.marblednull.marbledsarsenal.armors.helmets;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.CombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CombatHelmetRenderer extends GeoArmorRenderer<CombatHelmetArmorItem> {
    public CombatHelmetRenderer() {
        super(new CombatHelmetModel());
    }
}
