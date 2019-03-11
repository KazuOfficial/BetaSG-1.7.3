package me.kazu.betasg.listeners;

import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.SignChangeEvent;

public class BlockListeners extends BlockListener {
	
	String map = "City";
	
	public void onSignChange(SignChangeEvent e)
	{
		if (e.getLine(0).equalsIgnoreCase("[BetaSG]"))
		{
			e.setLine(0,"§a[BetaSG]");
			e.setLine(1, "§2" + PlayerListeners.arenaplayers.size() + "§2/12");
			e.setLine(2, "§aMap: " + "§2" + map);
			e.setLine(3, "§aClick to join!!");
		}
	}
}
