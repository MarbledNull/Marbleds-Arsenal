package net.marblednull.marbledsarsenal.armors.gas_masks.cm8m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalOliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalOliveHelmetCM8MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalOliveHelmetCM8MRenderer extends GeoArmorRenderer<MedicalOliveHelmetCM8MArmorItem> {
    public MedicalOliveHelmetCM8MRenderer() {
        super(new MedicalOliveHelmetCM8MModel());
    }
}
