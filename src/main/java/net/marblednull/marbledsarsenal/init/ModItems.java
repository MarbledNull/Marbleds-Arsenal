package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsapi.custom.ArmorMaterialsMAPI;
import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.HelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.OliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.UNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalOliveHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.medical.MedicalUNHelmetCM6MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.CM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.HelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.OliveHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.UNHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.medical.MedicalHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.medical.MedicalOliveHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.medical.MedicalUNHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.CM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.HelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.OliveHelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.UNHelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalHelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalOliveHelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.medical.MedicalUNHelmetCM8MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalOliveCombatHelmetArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.medical.MedicalUNCombatHelmetArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);
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

    //Gas Masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_helmet_cm6m_gas_mask", () -> new MedicalHelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_un_helmet_cm6m_gas_mask", () -> new MedicalUNHelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm6m_gas_mask", () -> new MedicalOliveHelmetCM6MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_helmet_cm7m_gas_mask", () -> new MedicalHelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_un_helmet_cm7m_gas_mask", () -> new MedicalUNHelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm7m_gas_mask", () -> new MedicalOliveHelmetCM7MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_helmet_cm8m_gas_mask", () -> new MedicalHelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_un_helmet_cm8m_gas_mask", () -> new MedicalUNHelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm8m_gas_mask", () -> new MedicalOliveHelmetCM8MArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WHITE_GP5_GAS_MASK = ITEMS.register("white_gp5_gas_mask", () -> new WhiteGP5ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_COMBAT_HELMET = ITEMS.register("medical_combat_helmet", () -> new MedicalCombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_COMBAT_HELMET = ITEMS.register("medical_un_combat_helmet", () -> new MedicalUNCombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_COMBAT_HELMET = ITEMS.register("medical_olive_combat_helmet", () -> new MedicalOliveCombatHelmetArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_MILITARY_BERET = ITEMS.register("black_military_beret", () -> new BlackMilitaryBeretArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Body Armors
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T1 = ITEMS.register("black_plate_carrier_t1", () -> new BlackPlateCarrierArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T2 = ITEMS.register("black_plate_carrier_t2", () -> new BlackPlateCarrierArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T3 = ITEMS.register("black_plate_carrier_t3", () -> new BlackPlateCarrierArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T1 = ITEMS.register("olive_plate_carrier_t1", () -> new OlivePlateCarrierArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T2 = ITEMS.register("olive_plate_carrier_t2", () -> new OlivePlateCarrierArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T3 = ITEMS.register("olive_plate_carrier_t3", () -> new OlivePlateCarrierArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Full Suits
    public static final RegistryObject<Item> RIOT_ARMOR_HELMET = ITEMS.register("riot_armor_helmet", () -> new RiotArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_CHESTPLATE = ITEMS.register("riot_armor_chestplate", () -> new RiotArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_LEGGINGS = ITEMS.register("riot_armor_leggings", () -> new RiotArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_BOOTS = ITEMS.register("riot_armor_boots", () -> new RiotArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> SWAT_ARMOR_HELMET = ITEMS.register("swat_armor_helmet", () -> new SwatArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_CHESTPLATE = ITEMS.register("swat_armor_chestplate", () -> new SwatArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_LEGGINGS = ITEMS.register("swat_armor_leggings", () -> new SwatArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_BOOTS = ITEMS.register("swat_armor_boots", () -> new SwatArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_HELMET = ITEMS.register("winter_military_armor_helmet", () -> new WinterMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("winter_military_armor_chestplate", () -> new WinterMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_LEGGINGS = ITEMS.register("winter_military_armor_leggings", () -> new WinterMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_BOOTS = ITEMS.register("winter_military_armor_boots", () -> new WinterMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_HELMET = ITEMS.register("desert_military_armor_helmet", () -> new DesertMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("desert_military_armor_chestplate", () -> new DesertMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_LEGGINGS = ITEMS.register("desert_military_armor_leggings", () -> new DesertMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_BOOTS = ITEMS.register("desert_military_armor_boots", () -> new DesertMilitaryArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> HAZMAT_ARMOR_HELMET = ITEMS.register("hazmat_armor_helmet", () -> new HazmatArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_CHESTPLATE = ITEMS.register("hazmat_armor_chestplate", () -> new HazmatArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_LEGGINGS = ITEMS.register("hazmat_armor_leggings", () -> new HazmatArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_BOOTS = ITEMS.register("hazmat_armor_boots", () -> new HazmatArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("olive_juggernaut_armor_helmet", () -> new OliveJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("olive_juggernaut_armor_chestplate", () -> new OliveJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("olive_juggernaut_armor_leggings", () -> new OliveJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("olive_juggernaut_armor_boots", () -> new OliveJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("black_juggernaut_armor_helmet", () -> new BlackJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("black_juggernaut_armor_chestplate", () -> new BlackJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("black_juggernaut_armor_leggings", () -> new BlackJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("black_juggernaut_armor_boots", () -> new BlackJuggernautArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Tools & Weapons

    //Crafting Items
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEVLAR = ITEMS.register("kevlar", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
