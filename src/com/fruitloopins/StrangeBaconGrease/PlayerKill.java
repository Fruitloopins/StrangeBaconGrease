package com.fruitloopins.StrangeBaconGrease;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerKill implements Listener{
	
@EventHandler
	   public void onKill(PlayerDeathEvent kill) {
	        if (kill.getEntity().getKiller() instanceof Player) 
	        {
	            Player killer = kill.getEntity().getKiller();
	            ItemMeta meta = killer.getInventory().getItemInMainHand().getItemMeta();
	            List<String> display = meta.getLore();
	            for (String s : display) {
	            	if (s.contains("§7Kills: "))	            
	            {
	            	int index = display.indexOf(s);
	            	s = s.replaceAll("§7Kills: ","");
	            	
	            	try {
	            		Integer kills = Integer.valueOf(s);
	            		kills = kills + 1;
	            		String ss = Integer.toString(kills);
	            		display.set(index, "§7Kills: " +ss);
	            		
	            	}	catch (NumberFormatException nfe) {
	            		nfe.printStackTrace();
	            		}
	            	}
	            }  
				meta.setLore(display);
				killer.getInventory().getItemInMainHand().setItemMeta(meta);
	        }
	}
}