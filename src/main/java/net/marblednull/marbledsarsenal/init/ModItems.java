package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.*;
import net.marblednull.marbledsarsenal.util.MaArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);
    //Gas masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CMI01_GAS_MASK = ITEMS.register("cmi01_gas_mask", () -> new CMI01ArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GP5_GAS_MASK = ITEMS.register("gp5_gas_mask", () -> new WhiteGP5ArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> RESPIRATOR = ITEMS.register("respirator", () -> new RespiratorArmorItem(MaArmorMaterials.GAS_MASK, ArmorItem.Type.HELMET, new Item.Properties()));

    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MILITARY_BERET = ITEMS.register("military_beret", () -> new MilitaryBeretArmorItem(MaArmorMaterials.HAT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(MaArmorMaterials.HAT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(MaArmorMaterials.HAT, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> BALACLAVA = ITEMS.register("balaclava", () -> new BalaclavaArmorItem(MaArmorMaterials.HAT, ArmorItem.Type.HELMET, new Item.Properties()));

    //Body armors/plate carriers
    public static final RegistryObject<Item> PLATE_CARRIER_LIGHT = ITEMS.register("plate_carrier_light", () -> new PlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATE_CARRIER_HEAVY = ITEMS.register("plate_carrier_heavy", () -> new PlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_HEAVY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_LIGHT = ITEMS.register("olive_plate_carrier_light", () -> new OlivePlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_LIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_HEAVY = ITEMS.register("olive_plate_carrier_heavy", () -> new OlivePlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_HEAVY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    //Full suits
    public static final RegistryObject<Item> RIOT_HELMET = ITEMS.register("riot_helmet", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_CHESTPLATE = ITEMS.register("riot_chestplate", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_LEGGINGS = ITEMS.register("riot_leggings", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RIOT_BOOTS = ITEMS.register("riot_boots", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WINTER_MILITARY_HELMET = ITEMS.register("winter_military_helmet", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_CHESTPLATE = ITEMS.register("winter_military_chestplate", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_LEGGINGS = ITEMS.register("winter_military_leggings", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WINTER_MILITARY_BOOTS = ITEMS.register("winter_military_boots", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DESERT_MILITARY_HELMET = ITEMS.register("desert_military_helmet", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_CHESTPLATE = ITEMS.register("desert_military_chestplate", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_LEGGINGS = ITEMS.register("desert_military_leggings", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DESERT_MILITARY_BOOTS = ITEMS.register("desert_military_boots", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WOODLAND_MILITARY_HELMET = ITEMS.register("woodland_military_helmet", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WOODLAND_MILITARY_CHESTPLATE = ITEMS.register("woodland_military_chestplate", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WOODLAND_MILITARY_LEGGINGS = ITEMS.register("woodland_military_leggings", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WOODLAND_MILITARY_BOOTS = ITEMS.register("woodland_military_boots", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SWAT_HELMET = ITEMS.register("swat_helmet", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_CHESTPLATE = ITEMS.register("swat_chestplate", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_LEGGINGS = ITEMS.register("swat_leggings", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SWAT_BOOTS = ITEMS.register("swat_boots", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> POLICE_HELMET = ITEMS.register("police_helmet", () -> new SwatArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> POLICE_CHESTPLATE = ITEMS.register("police_chestplate", () -> new SwatArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> POLICE_LEGGINGS = ITEMS.register("police_leggings", () -> new SwatArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> POLICE_BOOTS = ITEMS.register("police_boots", () -> new SwatArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SHERIFF_HELMET = ITEMS.register("sheriff_helmet", () -> new SheriffArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHERIFF_CHESTPLATE = ITEMS.register("sheriff_chestplate", () -> new SheriffArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SHERIFF_LEGGINGS = ITEMS.register("sheriff_leggings", () -> new SheriffArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SHERIFF_BOOTS = ITEMS.register("sheriff_boots", () -> new SheriffArmorItem(MaArmorMaterials.CIVIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HAZMAT_A_HELMET = ITEMS.register("hazmat_a_helmet", () -> new HazmatAArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_A_CHESTPLATE = ITEMS.register("hazmat_a_chestplate", () -> new HazmatAArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_A_LEGGINGS = ITEMS.register("hazmat_a_leggings", () -> new HazmatAArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_A_BOOTS = ITEMS.register("hazmat_a_boots", () -> new HazmatAArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HAZMAT_B_HELMET = ITEMS.register("hazmat_b_helmet", () -> new HazmatBArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_B_CHESTPLATE = ITEMS.register("hazmat_b_chestplate", () -> new HazmatBArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_B_LEGGINGS = ITEMS.register("hazmat_b_leggings", () -> new HazmatBArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_B_BOOTS = ITEMS.register("hazmat_b_boots", () -> new HazmatBArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HAZMAT_C_HELMET = ITEMS.register("hazmat_c_helmet", () -> new HazmatCArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_C_CHESTPLATE = ITEMS.register("hazmat_c_chestplate", () -> new HazmatCArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_C_LEGGINGS = ITEMS.register("hazmat_c_leggings", () -> new HazmatCArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HAZMAT_C_BOOTS = ITEMS.register("hazmat_c_boots", () -> new HazmatCArmorItem(MaArmorMaterials.HAZMAT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> JUGGERNAUT_HELMET = ITEMS.register("juggernaut_helmet", () -> new JuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JUGGERNAUT_CHESTPLATE = ITEMS.register("juggernaut_chestplate", () -> new JuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JUGGERNAUT_LEGGINGS = ITEMS.register("juggernaut_leggings", () -> new JuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JUGGERNAUT_BOOTS = ITEMS.register("juggernaut_boots", () -> new JuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_HELMET = ITEMS.register("black_juggernaut_helmet", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_CHESTPLATE = ITEMS.register("black_juggernaut_chestplate", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_LEGGINGS = ITEMS.register("black_juggernaut_leggings", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_BOOTS = ITEMS.register("black_juggernaut_boots", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.BOOTS, new Item.Properties()));

    //public static final RegistryObject<Item> CATMAID_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("catmaid_juggernaut_armor_helmet", () -> new CatmaidJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.HELMET, new Item.Properties()));
    //public static final RegistryObject<Item> CATMAID_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("catmaid_juggernaut_armor_chestplate", () -> new CatmaidJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    //public static final RegistryObject<Item> CATMAID_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("catmaid_juggernaut_armor_leggings", () -> new CatmaidJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    //public static final RegistryObject<Item> CATMAID_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("catmaid_juggernaut_armor_boots", () -> new CatmaidJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> OAK_GHILLIE_HELMET = ITEMS.register("oak_ghillie_helmet", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> OAK_GHILLIE_CHESTPLATE = ITEMS.register("oak_ghillie_chestplate", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> OAK_GHILLIE_LEGGINGS = ITEMS.register("oak_ghillie_leggings", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> OAK_GHILLIE_BOOTS = ITEMS.register("oak_ghillie_boots", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_GHILLIE_HELMET = ITEMS.register("spruce_ghillie_helmet", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_CHESTPLATE = ITEMS.register("spruce_ghillie_chestplate", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_LEGGINGS = ITEMS.register("spruce_ghillie_leggings", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_BOOTS = ITEMS.register("spruce_ghillie_boots", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_GHILLIE_HELMET = ITEMS.register("birch_ghillie_helmet", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_GHILLIE_CHESTPLATE = ITEMS.register("birch_ghillie_chestplate", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_GHILLIE_LEGGINGS = ITEMS.register("birch_ghillie_leggings", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_GHILLIE_BOOTS = ITEMS.register("birch_ghillie_boots", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_GHILLIE_HELMET = ITEMS.register("jungle_ghillie_helmet", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_CHESTPLATE = ITEMS.register("jungle_ghillie_chestplate", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_LEGGINGS = ITEMS.register("jungle_ghillie_leggings", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_BOOTS = ITEMS.register("jungle_ghillie_boots", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_GHILLIE_HELMET = ITEMS.register("acacia_ghillie_helmet", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_GHILLIE_CHESTPLATE = ITEMS.register("acacia_ghillie_chestplate", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_GHILLIE_LEGGINGS = ITEMS.register("acacia_ghillie_leggings", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_GHILLIE_BOOTS = ITEMS.register("acacia_ghillie_boots", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DARK_OAK_GHILLIE_HELMET = ITEMS.register("dark_oak_ghillie_helmet", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_CHESTPLATE = ITEMS.register("dark_oak_ghillie_chestplate", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_LEGGINGS = ITEMS.register("dark_oak_ghillie_leggings", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_BOOTS = ITEMS.register("dark_oak_ghillie_boots", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_GHILLIE_HELMET = ITEMS.register("mangrove_ghillie_helmet", () -> new MangroveGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_GHILLIE_CHESTPLATE = ITEMS.register("mangrove_ghillie_chestplate", () -> new MangroveGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_GHILLIE_LEGGINGS = ITEMS.register("mangrove_ghillie_leggings", () -> new MangroveGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_GHILLIE_BOOTS = ITEMS.register("mangrove_ghillie_boots", () -> new MangroveGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_GHILLIE_HELMET = ITEMS.register("cherry_ghillie_helmet", () -> new CherryGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_GHILLIE_CHESTPLATE = ITEMS.register("cherry_ghillie_chestplate", () -> new CherryGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_GHILLIE_LEGGINGS = ITEMS.register("cherry_ghillie_leggings", () -> new CherryGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_GHILLIE_BOOTS = ITEMS.register("cherry_ghillie_boots", () -> new CherryGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> AZALEA_GHILLIE_HELMET = ITEMS.register("azalea_ghillie_helmet", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AZALEA_GHILLIE_CHESTPLATE = ITEMS.register("azalea_ghillie_chestplate", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AZALEA_GHILLIE_LEGGINGS = ITEMS.register("azalea_ghillie_leggings", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AZALEA_GHILLIE_BOOTS = ITEMS.register("azalea_ghillie_boots", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Crafting items
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_ARMOR_PLATE = ITEMS.register("light_armor_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEVLAR = ITEMS.register("kevlar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEVLAR_THREAD = ITEMS.register("kevlar_thread", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VISOR = ITEMS.register("visor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRAP = ITEMS.register("strap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAVY_ARMOR_PLATE = ITEMS.register("heavy_armor_plate", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
