package com.fruitloopins.StrangeBaconGrease;

import java.util.Random;

import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class PigKill implements Listener {

@EventHandler
//1 in 500 chance to drop from a pig when killed by a player
		public void onKill(EntityDeathEvent kill) {	
    		if (kill.getEntity() instanceof Pig && kill.getEntity().getKiller() instanceof Player)
    		{
    			Random r = new Random();
    			float chance = r.nextFloat();
    			if (chance <= 0.002)
    		{
    			kill.getEntity().getWorld().dropItemNaturally(kill.getEntity().getLocation(), ItemManagement.strangeBaconGrease);
    		}
    	}
	}
}