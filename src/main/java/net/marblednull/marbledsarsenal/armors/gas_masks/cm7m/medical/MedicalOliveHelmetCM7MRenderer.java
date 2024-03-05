package net.marblednull.marbledsarsenal.armors.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalOliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalOliveHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalOliveHelmetCM7MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM7MArmorItem> {
    public MedicalOliveHelmetCM7MRenderer() {
        super(new MedicalOliveHelmetCM7MModel());
    }
}
