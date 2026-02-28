package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.*;
import net.marblednull.marbledsarsenal.util.MaArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);
    //Gas Masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(MaArmorMaterials.GAS_MASK, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(MaArmorMaterials.GAS_MASK, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(MaArmorMaterials.GAS_MASK, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WHITE_GP5_GAS_MASK = ITEMS.register("white_gp5_gas_mask", () -> new WhiteGP5ArmorItem(MaArmorMaterials.GAS_MASK, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(MaArmorMaterials.GAS_MASK, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(MaArmorMaterials.COMBAT_HELMET, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_MILITARY_BERET = ITEMS.register("black_military_beret", () -> new BlackMilitaryBeretArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Body Armors
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_LIGHT = ITEMS.register("black_plate_carrier_light", () -> new BlackPlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_LIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_HEAVY = ITEMS.register("black_plate_carrier_heavy", () -> new BlackPlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_HEAVY, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_LIGHT = ITEMS.register("olive_plate_carrier_light", () -> new OlivePlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_LIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_HEAVY = ITEMS.register("olive_plate_carrier_heavy", () -> new OlivePlateCarrierArmorItem(MaArmorMaterials.PLATE_CARRIER_HEAVY, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Full Suits
    public static final RegistryObject<Item> RIOT_ARMOR_HELMET = ITEMS.register("riot_armor_helmet", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_CHESTPLATE = ITEMS.register("riot_armor_chestplate", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_LEGGINGS = ITEMS.register("riot_armor_leggings", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_BOOTS = ITEMS.register("riot_armor_boots", () -> new RiotArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> SWAT_ARMOR_HELMET = ITEMS.register("swat_armor_helmet", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_CHESTPLATE = ITEMS.register("swat_armor_chestplate", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_LEGGINGS = ITEMS.register("swat_armor_leggings", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_BOOTS = ITEMS.register("swat_armor_boots", () -> new SwatArmorItem(MaArmorMaterials.TACTICAL, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_HELMET = ITEMS.register("winter_military_armor_helmet", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("winter_military_armor_chestplate", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_LEGGINGS = ITEMS.register("winter_military_armor_leggings", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_BOOTS = ITEMS.register("winter_military_armor_boots", () -> new WinterMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_HELMET = ITEMS.register("desert_military_armor_helmet", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("desert_military_armor_chestplate", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_LEGGINGS = ITEMS.register("desert_military_armor_leggings", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_BOOTS = ITEMS.register("desert_military_armor_boots", () -> new DesertMilitaryArmorItem(MaArmorMaterials.MILITARY, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> HAZMAT_ARMOR_HELMET = ITEMS.register("hazmat_armor_helmet", () -> new HazmatArmorItem(MaArmorMaterials.HAZMAT, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_CHESTPLATE = ITEMS.register("hazmat_armor_chestplate", () -> new HazmatArmorItem(MaArmorMaterials.HAZMAT, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_LEGGINGS = ITEMS.register("hazmat_armor_leggings", () -> new HazmatArmorItem(MaArmorMaterials.HAZMAT, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_BOOTS = ITEMS.register("hazmat_armor_boots", () -> new HazmatArmorItem(MaArmorMaterials.HAZMAT, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("olive_juggernaut_armor_helmet", () -> new OliveJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("olive_juggernaut_armor_chestplate", () -> new OliveJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("olive_juggernaut_armor_leggings", () -> new OliveJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("olive_juggernaut_armor_boots", () -> new OliveJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("black_juggernaut_armor_helmet", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("black_juggernaut_armor_chestplate", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("black_juggernaut_armor_leggings", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("black_juggernaut_armor_boots", () -> new BlackJuggernautArmorItem(MaArmorMaterials.JUGGERNAUT, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OAK_GHILLIE_HELMET = ITEMS.register("oak_ghillie_helmet", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OAK_GHILLIE_CHESTPLATE = ITEMS.register("oak_ghillie_chestplate", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OAK_GHILLIE_LEGGINGS = ITEMS.register("oak_ghillie_leggings", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OAK_GHILLIE_BOOTS = ITEMS.register("oak_ghillie_boots", () -> new OakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> SPRUCE_GHILLIE_HELMET = ITEMS.register("spruce_ghillie_helmet", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_CHESTPLATE = ITEMS.register("spruce_ghillie_chestplate", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_LEGGINGS = ITEMS.register("spruce_ghillie_leggings", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SPRUCE_GHILLIE_BOOTS = ITEMS.register("spruce_ghillie_boots", () -> new SpruceGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BIRCH_GHILLIE_HELMET = ITEMS.register("birch_ghillie_helmet", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BIRCH_GHILLIE_CHESTPLATE = ITEMS.register("birch_ghillie_chestplate", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BIRCH_GHILLIE_LEGGINGS = ITEMS.register("birch_ghillie_leggings", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BIRCH_GHILLIE_BOOTS = ITEMS.register("birch_ghillie_boots", () -> new BirchGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> JUNGLE_GHILLIE_HELMET = ITEMS.register("jungle_ghillie_helmet", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_CHESTPLATE = ITEMS.register("jungle_ghillie_chestplate", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_LEGGINGS = ITEMS.register("jungle_ghillie_leggings", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> JUNGLE_GHILLIE_BOOTS = ITEMS.register("jungle_ghillie_boots", () -> new JungleGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> ACACIA_GHILLIE_HELMET = ITEMS.register("acacia_ghillie_helmet", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ACACIA_GHILLIE_CHESTPLATE = ITEMS.register("acacia_ghillie_chestplate", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ACACIA_GHILLIE_LEGGINGS = ITEMS.register("acacia_ghillie_leggings", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ACACIA_GHILLIE_BOOTS = ITEMS.register("acacia_ghillie_boots", () -> new AcaciaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> DARK_OAK_GHILLIE_HELMET = ITEMS.register("dark_oak_ghillie_helmet", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_CHESTPLATE = ITEMS.register("dark_oak_ghillie_chestplate", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_LEGGINGS = ITEMS.register("dark_oak_ghillie_leggings", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DARK_OAK_GHILLIE_BOOTS = ITEMS.register("dark_oak_ghillie_boots", () -> new DarkOakGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> AZALEA_GHILLIE_HELMET = ITEMS.register("azalea_ghillie_helmet", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> AZALEA_GHILLIE_CHESTPLATE = ITEMS.register("azalea_ghillie_chestplate", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> AZALEA_GHILLIE_LEGGINGS = ITEMS.register("azalea_ghillie_leggings", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> AZALEA_GHILLIE_BOOTS = ITEMS.register("azalea_ghillie_boots", () -> new AzaleaGhillieArmorItem(MaArmorMaterials.GHILLIE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Crafting Items
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () -> new AxeItem(Tiers.IRON, 5, -3.1f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MODERN_AXE = ITEMS.register("modern_axe", () -> new AxeItem(Tiers.IRON, 6, -3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk", () -> new AxeItem(Tiers.IRON, 4, -2.6f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> PIPE_WRENCH = ITEMS.register("pipe_wrench", () -> new SwordItem(Tiers.IRON, 2, -2.3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer", () -> new SwordItem(Tiers.IRON, 9, -3.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> BONE_SAW = ITEMS.register("bone_saw", () -> new SwordItem(Tiers.IRON, 4, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> POLICE_BATON = ITEMS.register("police_baton", () -> new SwordItem(Tiers.IRON, 2, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete", () -> new SwordItem(Tiers.IRON, 5, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> STOP_SIGN = ITEMS.register("stop_sign", () -> new SwordItem(Tiers.IRON, 7, -3.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana", () -> new SwordItem(Tiers.IRON, 5, -2.7f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto", () -> new SwordItem(Tiers.IRON, 3, -2.3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat", () -> new SwordItem(Tiers.IRON, 1, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> BARBED_BASEBALL_BAT = ITEMS.register("barbed_baseball_bat", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> STEEL_BASEBALL_BAT = ITEMS.register("steel_baseball_bat", () -> new SwordItem(Tiers.IRON, 5, -2.7f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));

    //Crafting Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HARDENED_STEEL_INGOT = ITEMS.register("hardened_steel_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HARDENED_STEEL_SHEET = ITEMS.register("hardened_steel_sheet", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}