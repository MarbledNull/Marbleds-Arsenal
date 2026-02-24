package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OlivePlateCarrierModel;
import net.marblednull.marbledsarsenal.init.ArmorItems.OlivePlateCarrierArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OlivePlateCarrierRenderer extends GeoArmorRenderer<OlivePlateCarrierArmorItem> {
    public OlivePlateCarrierRenderer() {
        super(new OlivePlateCarrierModel());
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
