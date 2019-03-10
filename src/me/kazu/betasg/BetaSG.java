package me.kazu.betasg;

import org.bukkit.Bukkit;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

import me.kazu.betasg.listeners.BlockListeners;
import me.kazu.betasg.listeners.PlayerListeners;

public class BetaSG extends JavaPlugin{
	
	public void onEnable() 
	{
		System.out.println("[BetaSG] BetaSG is running!");
		Bukkit.getServer().getPluginManager().registerEvent(Type.SIGN_CHANGE, new BlockListeners(), Priority.Normal, this);
		Bukkit.getServer().getPluginManager().registerEvent(Type.PLAYER_INTERACT, new PlayerListeners(), Priority.Normal, this);
		Bukkit.getServer().getPluginManager().registerEvent(Type.PLAYER_MOVE, new PlayerListeners(), Priority.Normal, this);
	}
	
	public void onDisable()
	{
		System.out.println("[BetaSG] BetaSG is turning off!");
	}
	
}
