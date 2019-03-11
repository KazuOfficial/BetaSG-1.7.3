package me.kazu.betasg.listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListeners extends PlayerListener{
	
	static ArrayList<String> arenaplayers = new ArrayList<String>();
	static int size = arenaplayers.size();
	
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
				World mfworld = Bukkit.getServer().getWorld("MFWorld");
				
				Location loc1 = new Location(mfworld, 162, 45, 1098);
				Location loc2 = new Location(mfworld, 157, 47, 1138);
				Location loc3 = new Location(mfworld, 160, 39, 1180);
				Location loc4 = new Location(mfworld, 162, 45, 1098);
				Location loc5 = new Location(mfworld, 157, 47, 1138);
				Location loc6 = new Location(mfworld, 160, 39, 1180);
				Location loc7 = new Location(mfworld, 162, 45, 1098);
				Location loc8 = new Location(mfworld, 157, 47, 1138);
				Location loc9 = new Location(mfworld, 160, 39, 1180);
				Location loc10 = new Location(mfworld, 162, 45, 1098);
				Location loc11 = new Location(mfworld, 157, 47, 1138);
				Location loc12 = new Location(mfworld, 160, 39, 1180);
				
				if(size == 0)
				{
					p.teleport(loc1);
				}
				if(size == 1)
				{
					p.teleport(loc2);
				}
				if(size == 2)
				{
					p.teleport(loc3);
				}
				if(size == 3)
				{
					p.teleport(loc4);
				}
				if(size == 4)
				{
					p.teleport(loc5);
				}
				if(size == 5)
				{
					p.teleport(loc6);
				}
				if(size == 6)
				{
					p.teleport(loc7);
				}
				if(size == 7)
				{
					p.teleport(loc8);
				}
				if(size == 8)
				{
					p.teleport(loc9);
				}
				if(size == 9)
				{
					p.teleport(loc10);
				}
				if(size == 10)
				{
					p.teleport(loc11);
				}
				if(size == 11)
				{
					p.teleport(loc12);
				}
				else if(size > 11)
				{
					p.sendMessage(ChatColor.DARK_RED + "Map is full!");
					return;
				}
				
				arenaplayers.add(p.getName());
				String str = Integer.toString(size);
				s.setLine(1, str);
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