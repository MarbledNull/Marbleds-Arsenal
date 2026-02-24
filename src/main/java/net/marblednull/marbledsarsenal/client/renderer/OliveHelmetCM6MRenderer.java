package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveHelmetCM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.OliveHelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveHelmetCM6MRenderer extends GeoArmorRenderer<OliveHelmetCM6MArmorItem> {
    public OliveHelmetCM6MRenderer() {
        super(new OliveHelmetCM6MModel());
        this.headBone ="armorHead";
        this.bodyBone ="armorBody";
        this.rightArmBone ="armorRightArm";
        this.leftArmBone ="armorLeftArm";
        this.rightLegBone ="armorRightLeg";
        this.leftLegBone ="armorLeftLeg";
        this.leftBootBone ="armorLeftBoot";
        this.rightBootBone ="armorRightBoot";
    }
}
