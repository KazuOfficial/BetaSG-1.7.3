package me.kazu.betasg.listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListeners extends PlayerListener{
	
	ArrayList<String> frozen = new ArrayList<String>();
	public static int players = 0;
	
	boolean isOnArena = false;
	
	public void onPlayerInteract(PlayerInteractEvent e)
	{
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK))
			return;
		if (e.getClickedBlock().getState() instanceof Sign)
		{
			Sign s = (Sign) e.getClickedBlock().getState();
			
			if (s.getLine(0).equalsIgnoreCase("§a[BetaSG]"))
			{
					Player p = e.getPlayer();
					Location lc = new Location(Bukkit.getServer().getWorld("frakcje"), 6, 6, 6);
					p.teleport(lc);
					players++;
					String str = Integer.toString(players);
					s.setLine(1, str);
					isOnArena = true;
			}
		}
	}
	
	@Override
    public void onPlayerMove(PlayerMoveEvent e){
		if(isOnArena == true)
		{
	        Player p = e.getPlayer();
	        Location location = p.getLocation();
	        p.teleport(location);
		}
		else if(isOnArena == false)
		{
			return;
		}
    }

}