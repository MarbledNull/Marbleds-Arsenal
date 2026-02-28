package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.HelmetCM7MModel;
import net.marblednull.marbledsarsenal.init.item.HelmetCM7MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HelmetCM7MRenderer extends GeoArmorRenderer<HelmetCM7MArmorItem> {
    public HelmetCM7MRenderer() {
        super(new HelmetCM7MModel());
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
