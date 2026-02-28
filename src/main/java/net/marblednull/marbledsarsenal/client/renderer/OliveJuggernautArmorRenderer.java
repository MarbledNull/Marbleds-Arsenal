package net.marblednull.marbledsarsenal.client.renderer;

import net.marblednull.marbledsarsenal.client.model.OliveJuggernautArmorModel;
import net.marblednull.marbledsarsenal.init.item.OliveJuggernautArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class OliveJuggernautArmorRenderer extends GeoArmorRenderer<OliveJuggernautArmorItem> {
    public OliveJuggernautArmorRenderer() {
        super(new OliveJuggernautArmorModel());
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
