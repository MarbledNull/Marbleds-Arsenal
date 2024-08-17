package net.marblednull.marbledsarsenal.client.gas_masks.cm6m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.MedicalHelmetCM6MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalHelmetCM6MRenderer extends GeoArmorRenderer<MedicalHelmetCM6MArmorItem> {
    public MedicalHelmetCM6MRenderer() {
        super(new MedicalHelmetCM6MModel());
    }
}
