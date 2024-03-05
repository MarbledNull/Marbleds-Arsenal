package net.marblednull.marbledsarsenal.armors.helmets.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.UNCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalUNCombatHelmetArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalUNCombatHelmetRenderer extends GeoArmorRenderer<MedicalUNCombatHelmetArmorItem> {
    public MedicalUNCombatHelmetRenderer() {
        super(new MedicalUNCombatHelmetModel());
    }
}
