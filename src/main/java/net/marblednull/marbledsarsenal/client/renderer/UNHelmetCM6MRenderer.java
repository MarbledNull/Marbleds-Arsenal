package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.UNHelmetCM6MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.UNHelmetCM6MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class UNHelmetCM6MRenderer extends GeoArmorRenderer<UNHelmetCM6MArmorItem> {
    public UNHelmetCM6MRenderer() {
        super(new UNHelmetCM6MModel());
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
