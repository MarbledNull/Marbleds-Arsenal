package net.marblednull.marbledsarsenal.client.helmets.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalCombatHelmetRenderer extends GeoArmorRenderer<MedicalCombatHelmetArmorItem> {
    public MedicalCombatHelmetRenderer() {
        super(new MedicalCombatHelmetModel());
    }
}
