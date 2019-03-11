package me.kazu.betasg.listeners;

import java.util.ArrayList;

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
				ItemStack diamond = new ItemStack(Material.DIAMOND);
				ItemStack wsword = new ItemStack(Material.WOOD_SWORD);
				ItemStack ssword = new ItemStack(Material.STONE_SWORD);
				ItemStack frod = new ItemStack(Material.FISHING_ROD);
				ItemStack snowball6 = new ItemStack(Material.SNOW_BALL, 6);
				ItemStack snowball3 = new ItemStack(Material.SNOW_BALL, 3);
				ItemStack egg6 = new ItemStack(Material.EGG, 6);
				ItemStack egg3 = new ItemStack(Material.EGG, 3);
				ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS);
				ItemStack lleggings = new ItemStack(Material.LEATHER_LEGGINGS);
				ItemStack lchestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
				ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET);
				ItemStack gboots = new ItemStack(Material.GOLD_BOOTS);
				ItemStack gleggings = new ItemStack(Material.GOLD_LEGGINGS);
				ItemStack gchestplate = new ItemStack(Material.GOLD_CHESTPLATE);
				ItemStack ghelmet = new ItemStack(Material.GOLD_HELMET);
				ItemStack chelmet = new ItemStack(Material.CHAINMAIL_HELMET);
				ItemStack cchestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				ItemStack cleggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				ItemStack cboots = new ItemStack(Material.CHAINMAIL_BOOTS);
				ItemStack ispade = new ItemStack(Material.IRON_SPADE);
				ItemStack iaxe = new ItemStack(Material.IRON_AXE);
				ItemStack gaxe = new ItemStack(Material.GOLD_AXE);
				ItemStack waxe = new ItemStack(Material.WOOD_AXE);
				ItemStack iron = new ItemStack(Material.IRON_INGOT, 2);
				ItemStack cfish = new ItemStack(Material.COOKED_FISH);
				ItemStack wheat = new ItemStack(Material.WHEAT, 4);
				ItemStack apple = new ItemStack(Material.APPLE, 2);
				ItemStack book = new ItemStack(Material.BOOK);
				ItemStack arrow = new ItemStack(Material.ARROW, 5);
				ItemStack bread = new ItemStack(Material.BREAD);
				ItemStack cookie = new ItemStack(Material.COOKIE, 2);
				ItemStack map = new ItemStack(Material.MAP);
				ItemStack msoup = new ItemStack(Material.MUSHROOM_SOUP);
				ItemStack pork = new ItemStack(Material.PORK);
				ItemStack rfish = new ItemStack(Material.RAW_FISH, 2);
				ItemStack stick = new ItemStack(Material.STICK, 2);
				ItemStack gold = new ItemStack(Material.GOLD_INGOT, 2);
				ItemStack rtoad = new ItemStack(Material.RED_MUSHROOM, 4);
				ItemStack btoad = new ItemStack(Material.BROWN_MUSHROOM, 4);
				ItemStack bowl = new ItemStack(Material.BOWL, 4);
				
				c.getInventory().addItem(diamond);
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
	
	@Override
    public void onPlayerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
			if(arenaplayers.contains(p.getName()))
			{
				e.setTo(e.getFrom());
			}
			
	}

}