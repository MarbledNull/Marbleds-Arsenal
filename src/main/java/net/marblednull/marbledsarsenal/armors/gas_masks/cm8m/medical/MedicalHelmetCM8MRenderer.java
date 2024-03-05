package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalHelmetCM8MRenderer extends GeoArmorRenderer<MedicalHelmetCM8MArmorItem> {
    public MedicalHelmetCM8MRenderer() {
        super(new MedicalHelmetCM8MModel());
    }
}
