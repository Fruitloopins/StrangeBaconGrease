package com.fruitloopins.StrangeBaconGrease;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManagement {

    	public static ItemStack strangeBaconGrease;
    	public static ItemStack strangeNetheriteSword;
    	public static ItemStack strangeDiamondSword;
    	public static ItemStack strangeGoldenSword;
    	public static ItemStack strangeIronSword;
    	public static ItemStack strangeStoneSword;
    	public static ItemStack strangeWoodenSword;

    	public static void init() {
    		createBaconGrease();
    		createNetheriteSword();
    		createDiamondSword();
    		createGoldenSword();
    		createIronSword();
    		createStoneSword();
    		createWoodenSword();
    	}
    	//Strange Bacon Grease
    	private static void createBaconGrease() {
    		ItemStack baconGrease = new ItemStack(Material.POTION, 1);
    		ItemMeta sbgmeta = baconGrease.getItemMeta();
    		sbgmeta.setDisplayName("§x§C§F§6§A§3§2Strange Bacon Grease");
    		List<String> sbglore = new ArrayList<>();
    		sbglore.add("§7Add this to a sword to make it track kills...");
    		sbglore.add("§7So strange...");
    		sbgmeta.setLore(sbglore);
    		sbgmeta.addEnchant(Enchantment.LUCK, 1, false);
    		sbgmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    		sbgmeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
    		baconGrease.setItemMeta(sbgmeta);
    		strangeBaconGrease = baconGrease;
        }
    	//Strange Netherite Sword
    	private static void createNetheriteSword() {
	    	ItemStack netheriteSword = new ItemStack (Material.NETHERITE_SWORD, 1);
			ItemMeta snsmeta = netheriteSword.getItemMeta();
			snsmeta.setDisplayName("§x§C§F§6§A§3§2Strange Netherite Sword");
			List<String> snslore = new ArrayList<>();
			snslore.add("§7This item tracks kills");
			snslore.add("§7Kills: 0");
			snsmeta.setLore(snslore);
			netheriteSword.setItemMeta(snsmeta);
			strangeNetheriteSword = netheriteSword;
			
			ShapedRecipe snsRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_netherite_sword"), netheriteSword);
			snsRecipe.shape(" B ", " S ", "   ");
			snsRecipe.setIngredient('S', Material.NETHERITE_SWORD);
			snsRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(snsRecipe);
    	}
    	//Strange Diamond Sword
    	private static void createDiamondSword() {
	    	ItemStack diamondSword = new ItemStack (Material.DIAMOND_SWORD, 1);
			ItemMeta sdsmeta = diamondSword.getItemMeta();
			sdsmeta.setDisplayName("§x§C§F§6§A§3§2Strange Diamond Sword");
			List<String> sdslore = new ArrayList<>();
			sdslore.add("§7This item tracks kills");
			sdslore.add("§7Kills: 0");
			sdsmeta.setLore(sdslore);
			diamondSword.setItemMeta(sdsmeta);
			strangeDiamondSword = diamondSword;
			
			ShapedRecipe sdsRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_diamond_sword"), diamondSword);
			sdsRecipe.shape(" B ", " S ", "   ");
			sdsRecipe.setIngredient('S', Material.DIAMOND_SWORD);
			sdsRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(sdsRecipe);
    	}
    	//Strange Golden Sword
    	private static void createGoldenSword() {
	    	ItemStack goldenSword = new ItemStack (Material.GOLDEN_SWORD, 1);
			ItemMeta sgsmeta = goldenSword.getItemMeta();
			sgsmeta.setDisplayName("§x§C§F§6§A§3§2Strange Golden Sword");
			List<String> sgslore = new ArrayList<>();
			sgslore.add("§7This item tracks kills");
			sgslore.add("§7Kills: 0");
			sgsmeta.setLore(sgslore);
			goldenSword.setItemMeta(sgsmeta);
			strangeGoldenSword = goldenSword;
			
			ShapedRecipe sgsRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_golden_sword"), goldenSword);
			sgsRecipe.shape(" B ", " S ", "   ");
			sgsRecipe.setIngredient('S', Material.GOLDEN_SWORD);
			sgsRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(sgsRecipe);
    	}
       	//Strange Iron Sword
    	private static void createIronSword() {
	    	ItemStack ironSword = new ItemStack (Material.IRON_SWORD, 1);
			ItemMeta sismeta = ironSword.getItemMeta();
			sismeta.setDisplayName("§x§C§F§6§A§3§2Strange Iron Sword");
			List<String> sislore = new ArrayList<>();
			sislore.add("§7This item tracks kills");
			sislore.add("§7Kills: 0");
			sismeta.setLore(sislore);
			ironSword.setItemMeta(sismeta);
			strangeIronSword = ironSword;
			
			ShapedRecipe sisRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_iron_sword"), ironSword);
			sisRecipe.shape(" B ", " S ", "   ");
			sisRecipe.setIngredient('S', Material.IRON_SWORD);
			sisRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(sisRecipe);
    	}
    	//Strange Stone Sword
    	private static void createStoneSword() {
	    	ItemStack stoneSword = new ItemStack (Material.STONE_SWORD, 1);
			ItemMeta sssmeta = stoneSword.getItemMeta();
			sssmeta.setDisplayName("§x§C§F§6§A§3§2Strange Stone Sword");
			List<String> ssslore = new ArrayList<>();
			ssslore.add("§7This item tracks kills");
			ssslore.add("§7Kills: 0");
			sssmeta.setLore(ssslore);
			stoneSword.setItemMeta(sssmeta);
			strangeStoneSword = stoneSword;
			
			ShapedRecipe sssRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_stone_sword"), stoneSword);
			sssRecipe.shape(" B ", " S ", "   ");
			sssRecipe.setIngredient('S', Material.STONE_SWORD);
			sssRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(sssRecipe);
    	}
    	//Strange Wooden Sword
    	private static void createWoodenSword() {
	    	ItemStack woodenSword = new ItemStack (Material.WOODEN_SWORD, 1);
			ItemMeta swsmeta = woodenSword.getItemMeta();
			swsmeta.setDisplayName("§x§C§F§6§A§3§2Strange Wooden Sword");
			List<String> swslore = new ArrayList<>();
			swslore.add("§7This item tracks kills");
			swslore.add("§7Kills: 0");
			swsmeta.setLore(swslore);
			woodenSword.setItemMeta(swsmeta);
			strangeWoodenSword = woodenSword;
			
			ShapedRecipe swsRecipe = new ShapedRecipe(NamespacedKey.minecraft("strange_wooden_sword"), woodenSword);
			swsRecipe.shape(" B ", " S ", "   ");
			swsRecipe.setIngredient('S', Material.WOODEN_SWORD);
			swsRecipe.setIngredient('B', new RecipeChoice.ExactChoice(strangeBaconGrease));
			Bukkit.getServer().addRecipe(swsRecipe);
    	}
}