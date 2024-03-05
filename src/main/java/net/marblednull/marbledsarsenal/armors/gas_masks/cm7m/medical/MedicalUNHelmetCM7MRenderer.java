package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalUNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalUNHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalUNHelmetCM7MRenderer extends GeoArmorRenderer<MedicalUNHelmetCM7MArmorItem> {
    public MedicalUNHelmetCM7MRenderer() {
        super(new MedicalUNHelmetCM7MModel());
    }
}
