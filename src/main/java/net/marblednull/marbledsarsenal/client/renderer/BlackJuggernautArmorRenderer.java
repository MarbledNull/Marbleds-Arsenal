package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.BlackJuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.item.BlackJuggernautArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BlackJuggernautArmorRenderer extends GeoArmorRenderer<BlackJuggernautArmorItem> {
    public BlackJuggernautArmorRenderer() {
        super(new BlackJuggernautArmorModel());
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
