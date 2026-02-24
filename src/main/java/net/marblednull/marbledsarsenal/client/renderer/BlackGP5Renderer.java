package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackGP5Model;
import net.marblednull.marbledsarsenal.init.ArmorItems.BlackGP5ArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackGP5Renderer extends GeoArmorRenderer<BlackGP5ArmorItem> {
    public BlackGP5Renderer() {
        super(new BlackGP5Model());
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
