package net.marblednull.marbledsarsenal.client.helmets.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalOliveCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalOliveCombatHelmetRenderer extends GeoArmorRenderer<MedicalOliveCombatHelmetArmorItem> {
    public MedicalOliveCombatHelmetRenderer() {
        super(new MedicalOliveCombatHelmetModel());
    }
}
