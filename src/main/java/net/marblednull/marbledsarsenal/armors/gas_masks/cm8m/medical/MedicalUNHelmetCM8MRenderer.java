package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalUNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalUNHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalUNHelmetCM8MRenderer extends GeoArmorRenderer<MedicalUNHelmetCM8MArmorItem> {
    public MedicalUNHelmetCM8MRenderer() {
        super(new MedicalUNHelmetCM8MModel());
    }
}
