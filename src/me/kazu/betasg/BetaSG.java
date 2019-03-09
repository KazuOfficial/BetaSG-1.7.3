package me.kazu.betasg;

import org.bukkit.Bukkit;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

public class BetaSG extends JavaPlugin{
	
	public void onEnable() 
	{
		System.out.println("[BetaSG] BetaSG is running!");
		Bukkit.getServer().getPluginManager().registerEvent(Type.SIGN_CHANGE, new SignListeners(), null, null);
	}
	
	public void onDisable()
	{
		System.out.println("[BetaSG] BetaSG is turning off!");
	}
	
		
}
