package me.kazu.betasg.listeners;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Chest;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListeners extends PlayerListener{
	
	//kompas, kolorowa liczba graczy na tabliczce
	
	static ArrayList<String> arenaplayers = new ArrayList<String>();
	World mfworld = Bukkit.getServer().getWorld("MFWorld");
	
	public void onPlayerInteract(PlayerInteractEvent e)
	{
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK))
		{
			return;
		}
		
		if (e.getClickedBlock().getState() instanceof Chest)
		{
			Chest c = (Chest) e.getClickedBlock().getState();
			
			if(c.getWorld() == mfworld)
			{
				//Items
				int id = new Random().nextInt(Material.values().length);
				Material mat = Material.getMaterial(id);
				c.getInventory().addItem(new ItemStack(mat));
			}
		}
			
		if (e.getClickedBlock().getState() instanceof Sign)
		{
			Sign s = (Sign) e.getClickedBlock().getState();
			
			if (s.getLine(0).equalsIgnoreCase("§a[BetaSG]"))
			{
				Player p = e.getPlayer();
				
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
				
				if(arenaplayers.size() == 0)
				{
					p.teleport(loc1);
				}
				else if(arenaplayers.size() == 1)
				{
					p.teleport(loc2);
				}
				else if(arenaplayers.size() == 2)
				{
					p.teleport(loc3);
				}
				else if(arenaplayers.size() == 3)
				{
					p.teleport(loc4);
				}
				else if(arenaplayers.size() == 4)
				{
					p.teleport(loc5);
				}
				else if(arenaplayers.size() == 5)
				{
					p.teleport(loc6);
				}
				else if(arenaplayers.size() == 6)
				{
					p.teleport(loc7);
				}
				else if(arenaplayers.size() == 7)
				{
					p.teleport(loc8);
				}
				else if(arenaplayers.size() == 8)
				{
					p.teleport(loc9);
				}
				else if(arenaplayers.size() == 9)
				{
					p.teleport(loc10);
				}
				else if(arenaplayers.size() == 10)
				{
					p.teleport(loc11);
				}
				else if(arenaplayers.size() == 11)
				{
					p.teleport(loc12);
				}
				else if(arenaplayers.size() > 11)
				{
					p.sendMessage(ChatColor.DARK_RED + "Map is full!");
					return;
				}
				
				arenaplayers.add(p.getName());
				p.sendMessage(ChatColor.GREEN + "You have joined to the arena!");
				String str = Integer.toString(arenaplayers.size());
				s.setLine(1, str);
				
				
			}
		}
	}
	
	//@Override
   // public void onPlayerMove(PlayerMoveEvent e){
	//	Player p = e.getPlayer();
		//	if(arenaplayers.contains(p.getName()))
		//	{
			//	e.setTo(e.getFrom());
		//	}
			
//	}

}