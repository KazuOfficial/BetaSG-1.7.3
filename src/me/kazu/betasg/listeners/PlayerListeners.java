package me.kazu.betasg.listeners;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListeners extends PlayerListener{
	
	ArrayList<String> arenaplayers = new ArrayList<String>();
	
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
				Player target = Bukkit.getServer().getPlayer(args[0]);
				
				
				Location spongebob = new Location(Bukkit.getServer().getWorld("MFWorld"), 162, 45, 1098);
				Location squidward = new Location(Bukkit.getServer().getWorld("MFWorld"), 157, 47, 1138);
				Location patrick = new Location(Bukkit.getServer().getWorld("MFWorld"), 160, 39, 1180);
				
				if(players == 0)
				{
					p.teleport(spongebob);
				}
				else if(players == 1)
				{
					p.teleport(squidward);
				}
				else if(players == 2)
				{
					p.teleport(patrick);
				}
				else if(players == 3)
				{
					p.teleport(squidward);
				}
				else if(players == 4)
				{
					p.teleport(patrick);
				}
				else if(players == 5)
				{
					p.teleport(squidward);
				}
				else if(players == 6)
				{
					p.teleport(patrick);
				}
				else if(players == 7)
				{
					p.teleport(squidward);
				}
				else if(players == 8)
				{
					p.teleport(patrick);
				}
				else if(players == 9)
				{
					p.teleport(squidward);
				}
				else if(players == 10)
				{
					p.teleport(patrick);
				}
				else if(players == 11)
				{
					p.teleport(squidward);
				}
				else if(players == 12)
				{
					p.teleport(patrick);
				}
				else return;
				
				players++;
				String str = Integer.toString(players);
				s.setLine(1, str);
				
				arenaplayers.add(target.getName());
			}
		}
	}
	
	@Override
    public void onPlayerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		if(arenaplayers.contains(p.getName()))
		{
			e.setTo(e.getFrom());
			try
			{
			    Thread.sleep(10000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
		}
    }

}