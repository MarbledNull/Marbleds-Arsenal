package net.marblednull.marbledsarsenal.events;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.client.renderer.*;
import net.marblednull.marbledsarsenal.init.item.*;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MarbledsArsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(CM6MArmorItem.class, CM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM6MArmorItem.class, HelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM6MArmorItem.class, UNHelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM6MArmorItem.class, OliveHelmetCM6MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(CM7MArmorItem.class, CM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM7MArmorItem.class, HelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM7MArmorItem.class, UNHelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM7MArmorItem.class, OliveHelmetCM7MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(CM8MArmorItem.class, CM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM8MArmorItem.class, HelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM8MArmorItem.class, UNHelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM8MArmorItem.class, OliveHelmetCM8MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(WhiteGP5ArmorItem.class, WhiteGP5Renderer::new);
        GeoArmorRenderer.registerArmorRenderer(BlackGP5ArmorItem.class, BlackGP5Renderer::new);

        GeoArmorRenderer.registerArmorRenderer(BlackMilitaryBeretArmorItem.class, BlackMilitaryBeretRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(RedMilitaryBeretArmorItem.class, RedMilitaryBeretRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNMilitaryBeretArmorItem.class, UNMilitaryBeretRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(CombatHelmetArmorItem.class, CombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNCombatHelmetArmorItem.class, UNCombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveCombatHelmetArmorItem.class, OliveCombatHelmetRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(BlackPlateCarrierArmorItem.class, BlackPlateCarrierRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OlivePlateCarrierArmorItem.class, OlivePlateCarrierRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(RiotArmorItem.class, RiotArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(SwatArmorItem.class, SwatArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(WinterMilitaryArmorItem.class, WinterMilitaryArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(DesertMilitaryArmorItem.class, DesertMilitaryArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(HazmatArmorItem.class, HazmatArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(OliveJuggernautArmorItem.class, OliveJuggernautArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(BlackJuggernautArmorItem.class, BlackJuggernautArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(OakGhillieArmorItem.class, OakGhillieRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(DarkOakGhillieArmorItem.class, DarkOakGhillieRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(BirchGhillieArmorItem.class, BirchGhillieRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(JungleGhillieArmorItem.class, JungleGhillieRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(SpruceGhillieArmorItem.class, SpruceGhillieRenderer::new);
    }
}