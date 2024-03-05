package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalHelmetCM7MRenderer extends GeoArmorRenderer<MedicalHelmetCM7MArmorItem> {
    public MedicalHelmetCM7MRenderer() {
        super(new MedicalHelmetCM7MModel());
    }
}
