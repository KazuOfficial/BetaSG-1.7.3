package me.kazu.betasg.listeners;

import org.bukkit.block.Sign;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;

import pl.moresteck.multiworld.commands.MTeleport;

public class PlayerListeners extends PlayerListener{
	
	public void onPlayerInteract(PlayerInteractEvent e)
	{
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK))
			return;
		if (e.getClickedBlock().getState() instanceof Sign)
		{
			Sign s = (Sign) e.getClickedBlock().getState();
			
			if (s.getLine(0).equalsIgnoreCase("§a[BetaSG]"))
			{
				//tp player to the sg arena by multiverse
				MTeleport tpworld = new MTeleport(null, null, null);
			}
		}
	}
}