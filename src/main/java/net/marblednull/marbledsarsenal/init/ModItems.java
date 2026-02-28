package net.marblednull.marbledsarsenal.init;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.item.CM6MArmorItem;
import net.marblednull.marbledsarsenal.init.item.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.item.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.item.full_suits.*;
import net.marblednull.marbledsarsenal.init.item.gas_masks.cm6m.*;
import net.marblednull.marbledsarsenal.init.item.gas_masks.cm7m.*;
import net.marblednull.marbledsarsenal.init.item.gas_masks.cm8m.*;
import net.marblednull.marbledsarsenal.init.item.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.item.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.item.helmets.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsArsenal.MODID);

    //Gas Masks
    public static final RegistryObject<Item> CM6M_GAS_MASK = ITEMS.register("cm6m_gas_mask", () -> new CM6MArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM6M_GAS_MASK = ITEMS.register("helmet_cm6m_gas_mask", () -> new HelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM6M_GAS_MASK = ITEMS.register("un_helmet_cm6m_gas_mask", () -> new UNHelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("olive_helmet_cm6m_gas_mask", () -> new OliveHelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_helmet_cm6m_gas_mask", () -> new MedicalHelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_un_helmet_cm6m_gas_mask", () -> new MedicalUNHelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm6m_gas_mask", () -> new MedicalOliveHelmetCM6MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM7M_GAS_MASK = ITEMS.register("cm7m_gas_mask", () -> new CM7MArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM7M_GAS_MASK = ITEMS.register("helmet_cm7m_gas_mask", () -> new HelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM7M_GAS_MASK = ITEMS.register("un_helmet_cm7m_gas_mask", () -> new UNHelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("olive_helmet_cm7m_gas_mask", () -> new OliveHelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_helmet_cm7m_gas_mask", () -> new MedicalHelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_un_helmet_cm7m_gas_mask", () -> new MedicalUNHelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm7m_gas_mask", () -> new MedicalOliveHelmetCM7MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> CM8M_GAS_MASK = ITEMS.register("cm8m_gas_mask", () -> new CM8MArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HELMET_CM8M_GAS_MASK = ITEMS.register("helmet_cm8m_gas_mask", () -> new HelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_HELMET_CM8M_GAS_MASK = ITEMS.register("un_helmet_cm8m_gas_mask", () -> new UNHelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("olive_helmet_cm8m_gas_mask", () -> new OliveHelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_helmet_cm8m_gas_mask", () -> new MedicalHelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_un_helmet_cm8m_gas_mask", () -> new MedicalUNHelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK = ITEMS.register("medical_olive_helmet_cm8m_gas_mask", () -> new MedicalOliveHelmetCM8MArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WHITE_GP5_GAS_MASK = ITEMS.register("white_gp5_gas_mask", () -> new WhiteGP5ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_GP5_GAS_MASK = ITEMS.register("black_gp5_gas_mask", () -> new BlackGP5ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Headwear
    public static final RegistryObject<Item> COMBAT_HELMET = ITEMS.register("combat_helmet", () -> new CombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_COMBAT_HELMET = ITEMS.register("un_combat_helmet", () -> new UNCombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_COMBAT_HELMET = ITEMS.register("olive_combat_helmet", () -> new OliveCombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_COMBAT_HELMET = ITEMS.register("medical_combat_helmet", () -> new MedicalCombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_UN_COMBAT_HELMET = ITEMS.register("medical_un_combat_helmet", () -> new MedicalUNCombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> MEDICAL_OLIVE_COMBAT_HELMET = ITEMS.register("medical_olive_combat_helmet", () -> new MedicalOliveCombatHelmetArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_MILITARY_BERET = ITEMS.register("black_military_beret", () -> new BlackMilitaryBeretArmorItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RED_MILITARY_BERET = ITEMS.register("red_military_beret", () -> new RedMilitaryBeretArmorItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> UN_MILITARY_BERET = ITEMS.register("un_military_beret", () -> new UNMilitaryBeretArmorItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Body Armors
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T1 = ITEMS.register("black_plate_carrier_t1", () -> new BlackPlateCarrierArmorItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T2 = ITEMS.register("black_plate_carrier_t2", () -> new BlackPlateCarrierArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_PLATE_CARRIER_T3 = ITEMS.register("black_plate_carrier_t3", () -> new BlackPlateCarrierArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T1 = ITEMS.register("olive_plate_carrier_t1", () -> new OlivePlateCarrierArmorItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T2 = ITEMS.register("olive_plate_carrier_t2", () -> new OlivePlateCarrierArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_PLATE_CARRIER_T3 = ITEMS.register("olive_plate_carrier_t3", () -> new OlivePlateCarrierArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    //Full Suits
    public static final RegistryObject<Item> RIOT_ARMOR_HELMET = ITEMS.register("riot_armor_helmet", () -> new RiotArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_CHESTPLATE = ITEMS.register("riot_armor_chestplate", () -> new RiotArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_LEGGINGS = ITEMS.register("riot_armor_leggings", () -> new RiotArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> RIOT_ARMOR_BOOTS = ITEMS.register("riot_armor_boots", () -> new RiotArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> SWAT_ARMOR_HELMET = ITEMS.register("swat_armor_helmet", () -> new SwatArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_CHESTPLATE = ITEMS.register("swat_armor_chestplate", () -> new SwatArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_LEGGINGS = ITEMS.register("swat_armor_leggings", () -> new SwatArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> SWAT_ARMOR_BOOTS = ITEMS.register("swat_armor_boots", () -> new SwatArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_HELMET = ITEMS.register("winter_military_armor_helmet", () -> new WinterMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("winter_military_armor_chestplate", () -> new WinterMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_LEGGINGS = ITEMS.register("winter_military_armor_leggings", () -> new WinterMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> WINTER_MILITARY_ARMOR_BOOTS = ITEMS.register("winter_military_armor_boots", () -> new WinterMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_HELMET = ITEMS.register("desert_military_armor_helmet", () -> new DesertMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_CHESTPLATE = ITEMS.register("desert_military_armor_chestplate", () -> new DesertMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_LEGGINGS = ITEMS.register("desert_military_armor_leggings", () -> new DesertMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> DESERT_MILITARY_ARMOR_BOOTS = ITEMS.register("desert_military_armor_boots", () -> new DesertMilitaryArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> HAZMAT_ARMOR_HELMET = ITEMS.register("hazmat_armor_helmet", () -> new HazmatArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_CHESTPLATE = ITEMS.register("hazmat_armor_chestplate", () -> new HazmatArmorItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_LEGGINGS = ITEMS.register("hazmat_armor_leggings", () -> new HazmatArmorItem(ArmorMaterial.IRON, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> HAZMAT_ARMOR_BOOTS = ITEMS.register("hazmat_armor_boots", () -> new HazmatArmorItem(ArmorMaterial.IRON, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("olive_juggernaut_armor_helmet", () -> new OliveJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("olive_juggernaut_armor_chestplate", () -> new OliveJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("olive_juggernaut_armor_leggings", () -> new OliveJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> OLIVE_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("olive_juggernaut_armor_boots", () -> new OliveJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_HELMET = ITEMS.register("black_juggernaut_armor_helmet", () -> new BlackJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = ITEMS.register("black_juggernaut_armor_chestplate", () -> new BlackJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_LEGGINGS = ITEMS.register("black_juggernaut_armor_leggings", () -> new BlackJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> BLACK_JUGGERNAUT_ARMOR_BOOTS = ITEMS.register("black_juggernaut_armor_boots", () -> new BlackJuggernautArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.FEET, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));

    //Tools & Weapons
    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar", () -> new SwordItem(ItemTier.IRON, 3, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () -> new AxeItem(ItemTier.IRON, 5, -3.1f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MODERN_AXE = ITEMS.register("modern_axe", () -> new AxeItem(ItemTier.IRON, 6, -3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk", () -> new AxeItem(ItemTier.IRON, 4, -2.6f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> PIPE_WRENCH = ITEMS.register("pipe_wrench", () -> new SwordItem(ItemTier.IRON, 2, -2.3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer", () -> new SwordItem(ItemTier.IRON, 9, -3.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> BONE_SAW = ITEMS.register("bone_saw", () -> new SwordItem(ItemTier.IRON, 4, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> POLICE_BATON = ITEMS.register("police_baton", () -> new SwordItem(ItemTier.IRON, 2, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete", () -> new SwordItem(ItemTier.IRON, 5, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> STOP_SIGN = ITEMS.register("stop_sign", () -> new SwordItem(ItemTier.IRON, 7, -3.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(1000)));
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana", () -> new SwordItem(ItemTier.IRON, 5, -2.7f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));
    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto", () -> new SwordItem(ItemTier.IRON, 3, -2.3f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(250)));
    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat", () -> new SwordItem(ItemTier.IRON, 1, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> BARBED_BASEBALL_BAT = ITEMS.register("barbed_baseball_bat", () -> new SwordItem(ItemTier.IRON, 3, -2.4f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(500)));
    public static final RegistryObject<Item> STEEL_BASEBALL_BAT = ITEMS.register("steel_baseball_bat", () -> new SwordItem(ItemTier.IRON, 5, -2.7f, new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL).durability(750)));

    //Crafting Items
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> GAS_MASK_FILTER = ITEMS.register("gas_mask_filter", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));
    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate", () -> new Item(new Item.Properties().tab(ModTabs.MARBLEDS_ARSENAL)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}