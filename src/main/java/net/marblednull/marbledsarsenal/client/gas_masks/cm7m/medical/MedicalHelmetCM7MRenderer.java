package net.marblednull.marbledsarsenal.client.gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalHelmetCM7MArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MedicalHelmetCM7MRenderer extends GeoArmorRenderer<MedicalHelmetCM7MArmorItem> {
    public MedicalHelmetCM7MRenderer() {
        super(new MedicalHelmetCM7MModel());
    }
}
