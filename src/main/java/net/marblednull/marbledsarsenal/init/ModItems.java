package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);

    //Melee weapons
    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar",
            () -> new SwordItem(ItemTier.IRON, 3, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe",
            () -> new AxeItem(ItemTier.IRON, 5, -3.1f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MODERN_AXE = ITEMS.register("modern_axe",
            () -> new AxeItem(ItemTier.IRON, 6, -3f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk",
            () -> new AxeItem(ItemTier.IRON, 4, -2.6f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> PIPE_WRENCH = ITEMS.register("pipe_wrench",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer",
            () -> new SwordItem(ItemTier.IRON, 9, -3.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> BONE_SAW = ITEMS.register("bone_saw",
            () -> new SwordItem(ItemTier.IRON, 1, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> POLICE_BATON = ITEMS.register("police_baton",
            () -> new SwordItem(ItemTier.IRON, 0, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete",
            () -> new SwordItem(ItemTier.IRON, 5, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> STOP_SIGN = ITEMS.register("stop_sign",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> PIPE = ITEMS.register("pipe",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> COMBAT_KNIFE = ITEMS.register("combat_knife",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> BUTCHER_KNIFE = ITEMS.register("butcher_knife",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> KITCHEN_KNIFE = ITEMS.register("kitchen_knife",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> GOLF_CLUB = ITEMS.register("golf_club",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> BARBED_BASEBALL_BAT = ITEMS.register("barbed_baseball_bat",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> METAL_BASEBALL_BAT = ITEMS.register("metal_baseball_bat",
            () -> new SwordItem(ItemTier.IRON, 2, -2.4f,
                    new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));

    //Gas Masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(ArmorMaterialsMA.IRON1, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_helmet_cm6m_gas_mask", () -> new MedicalHelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_un_helmet_cm6m_gas_mask", () -> new MedicalUNHelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm6m_gas_mask", () -> new MedicalOliveHelmetCM6MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(ArmorMaterialsMA.IRON1, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_helmet_cm7m_gas_mask", () -> new MedicalHelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_un_helmet_cm7m_gas_mask", () -> new MedicalUNHelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm7m_gas_mask", () -> new MedicalOliveHelmetCM7MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(ArmorMaterialsMA.IRON1, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_helmet_cm8m_gas_mask", () -> new MedicalHelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_un_helmet_cm8m_gas_mask", () -> new MedicalUNHelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm8m_gas_mask", () -> new MedicalOliveHelmetCM8MArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WHITE_GP5_GAS_MASK = ITEMS.register("white_gp5_gas_mask", () -> new WhiteGP5ArmorItem(ArmorMaterialsMA.IRON1, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(ArmorMaterialsMA.IRON1, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_COMBAT_HELMET = ITEMS.register("medical_combat_helmet", () -> new MedicalCombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_COMBAT_HELMET = ITEMS.register("medical_un_combat_helmet", () -> new MedicalUNCombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_COMBAT_HELMET = ITEMS.register("medical_olive_combat_helmet", () -> new MedicalOliveCombatHelmetArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_MILITARY_BERET = ITEMS.register("black_military_beret", () -> new BlackMilitaryBeretArmorItem(ArmorMaterialsMA.LEATHER3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(ArmorMaterialsMA.LEATHER3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(ArmorMaterialsMA.LEATHER3, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Body Armors
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T1 = ITEMS.register("black_plate_carrier_t1", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T2 = ITEMS.register("black_plate_carrier_t2", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMA.IRON4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T3 = ITEMS.register("black_plate_carrier_t3", () -> new BlackPlateCarrierArmorItem(ArmorMaterialsMA.IRON5, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T1 = ITEMS.register("olive_plate_carrier_t1", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMA.IRON3, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T2 = ITEMS.register("olive_plate_carrier_t2", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMA.IRON4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T3 = ITEMS.register("olive_plate_carrier_t3", () -> new OlivePlateCarrierArmorItem(ArmorMaterialsMA.IRON5, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Full Suits
    public static final RegistryObject<Item> RIOT_ARMOR_HELMET = ITEMS.register("riot_armor_helmet", () -> new RiotArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_CHESTPLATE = ITEMS.register("riot_armor_chestplate", () -> new RiotArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_LEGGINGS = ITEMS.register("riot_armor_leggings", () -> new RiotArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_BOOTS = ITEMS.register("riot_armor_boots", () -> new RiotArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> SWAT_ARMOR_HELMET = ITEMS.register("swat_armor_helmet", () -> new SwatArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_CHESTPLATE = ITEMS.register("swat_armor_chestplate", () -> new SwatArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_LEGGINGS = ITEMS.register("swat_armor_leggings", () -> new SwatArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_BOOTS = ITEMS.register("swat_armor_boots", () -> new SwatArmorItem(ArmorMaterialsMA.DIAMOND4, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_HELMET = ITEMS.register("winter_military_armor_helmet", () -> new WinterMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("winter_military_armor_chestplate", () -> new WinterMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_LEGGINGS = ITEMS.register("winter_military_armor_leggings", () -> new WinterMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_BOOTS = ITEMS.register("winter_military_armor_boots", () -> new WinterMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_HELMET = ITEMS.register("desert_military_armor_helmet", () -> new DesertMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("desert_military_armor_chestplate", () -> new DesertMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_LEGGINGS = ITEMS.register("desert_military_armor_leggings", () -> new DesertMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_BOOTS = ITEMS.register("desert_military_armor_boots", () -> new DesertMilitaryArmorItem(ArmorMaterialsMA.DIAMOND5, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> HAZMAT_ARMOR_HELMET = ITEMS.register("hazmat_armor_helmet", () -> new HazmatArmorItem(ArmorMaterialsMA.LEATHER4, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_CHESTPLATE = ITEMS.register("hazmat_armor_chestplate", () -> new HazmatArmorItem(ArmorMaterialsMA.LEATHER4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_LEGGINGS = ITEMS.register("hazmat_armor_leggings", () -> new HazmatArmorItem(ArmorMaterialsMA.LEATHER4, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_BOOTS = ITEMS.register("hazmat_armor_boots", () -> new HazmatArmorItem(ArmorMaterialsMA.LEATHER4, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("olive_juggernaut_armor_helmet", () -> new OliveJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("olive_juggernaut_armor_chestplate", () -> new OliveJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("olive_juggernaut_armor_leggings", () -> new OliveJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("olive_juggernaut_armor_boots", () -> new OliveJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("black_juggernaut_armor_helmet", () -> new BlackJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("black_juggernaut_armor_chestplate", () -> new BlackJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("black_juggernaut_armor_leggings", () -> new BlackJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("black_juggernaut_armor_boots", () -> new BlackJuggernautArmorItem(ArmorMaterialsMA.NETHERITE4, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Tools & Weapons

    //Crafting Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> HARDENED_STEEL_INGOT = ITEMS.register("hardened_steel_ingot", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HARDENED_STEEL_SHEET = ITEMS.register("hardened_steel_sheet", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

   //EXTRAS TAB


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}