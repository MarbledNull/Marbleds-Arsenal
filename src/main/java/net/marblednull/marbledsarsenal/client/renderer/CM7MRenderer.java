package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.CM7MModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.CM7MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CM7MRenderer extends GeoArmorRenderer<CM7MArmorItem> {
    public CM7MRenderer() {
        super(new CM7MModel());
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
