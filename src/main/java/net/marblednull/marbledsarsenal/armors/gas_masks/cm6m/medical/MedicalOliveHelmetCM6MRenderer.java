package net.marblednull.marbledsarsenal.armors.gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalOliveHelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalOliveHelmetCM6MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM6MArmorItem> {
    public MedicalOliveHelmetCM6MRenderer() {
        super(new MedicalOliveHelmetCM6MModel());
    }
}
