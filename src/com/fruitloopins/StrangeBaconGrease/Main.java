package com.fruitloopins.StrangeBaconGrease;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() { 
		ItemManagement.init();
		getCommand("sbg").setExecutor(new Commands());
		
		getServer().getPluginManager().registerEvents(new PigKill(), this);
		getServer().getPluginManager().registerEvents(new PlayerKill(), this);
	}
	
	@Override
	public void onDisable() { }
}
