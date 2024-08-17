package net.marblednull.marbledsarsenal.client.helmets.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalUNCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalUNCombatHelmetRenderer extends GeoArmorRenderer<MedicalUNCombatHelmetArmorItem> {
    public MedicalUNCombatHelmetRenderer() {
        super(new MedicalUNCombatHelmetModel());
    }
}
