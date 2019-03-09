package me.kazu.betasg;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignListeners implements Listener {
	
	String players = "0";
	String map = "City";
	
	public void onSignChange(SignChangeEvent e)
	{
		if (e.getLine(0).equalsIgnoreCase("[BetaSG]"))
		{
			e.setLine(0, ChatColor.GREEN + "[BetaSG]");
			e.setLine(1, ChatColor.DARK_GREEN + players + "/24");
			e.setLine(2, ChatColor.DARK_GREEN + "Map: " + map);
			e.setLine(3, ChatColor.DARK_GREEN + "Click to join!");
		}
	}
	
	public void onPlayerInteract(PlayerInteractEvent e)
	{
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK))
			return;
		if (e.getClickedBlock().getState() instanceof Sign)
		{
			Sign s = (Sign) e.getClickedBlock().getState();
			
			//if (s.getLine(0).equalsIgnoreCase(ChatColor.GREEN + "[BetaSG]"))
			{
				
			}
		}
	}
}
