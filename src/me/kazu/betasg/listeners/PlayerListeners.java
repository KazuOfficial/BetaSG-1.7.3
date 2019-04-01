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
				ItemStack air = new ItemStack(Material.AIR);
				ItemStack apple = new ItemStack(Material.APPLE);
				ItemStack arrow = new ItemStack(Material.ARROW);
				ItemStack bed = new ItemStack(Material.BED);
				ItemStack bed_block = new ItemStack(Material.BED_BLOCK);
				ItemStack bedrock = new ItemStack(Material.BEDROCK);
				ItemStack boat = new ItemStack(Material.BOAT);
				ItemStack bone = new ItemStack(Material.BONE);
				ItemStack book = new ItemStack(Material.BOOK);
				ItemStack bookshelf = new ItemStack(Material.BOOKSHELF);
				ItemStack bow = new ItemStack(Material.BOW);
				ItemStack bowl = new ItemStack(Material.BOWL);
				ItemStack bread = new ItemStack(Material.BREAD);
				ItemStack brick = new ItemStack(Material.BRICK);
				ItemStack brown_mushroom = new ItemStack(Material.BROWN_MUSHROOM);
				ItemStack bucket = new ItemStack(Material.BUCKET);
				ItemStack burning_furnace = new ItemStack(Material.BURNING_FURNACE);
				ItemStack cactus = new ItemStack(Material.CACTUS);
				ItemStack cake = new ItemStack(Material.CAKE);
				ItemStack cake_block = new ItemStack(Material.CAKE_BLOCK);
				ItemStack chainmail_boots = new ItemStack(Material.CHAINMAIL_BOOTS);
				ItemStack chainmail_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				ItemStack chainmail_helmet = new ItemStack(Material.CHAINMAIL_HELMET);
				ItemStack chainmail_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				ItemStack chest = new ItemStack(Material.CHEST);
				ItemStack clay = new ItemStack(Material.CLAY);
				ItemStack clay_ball = new ItemStack(Material.CLAY_BALL);
				ItemStack clay_brick = new ItemStack(Material.CLAY_BRICK);
				ItemStack coal = new ItemStack(Material.COAL);
				ItemStack coal_ore = new ItemStack(Material.COAL_ORE);
				ItemStack cobblestone = new ItemStack(Material.COBBLESTONE);
				ItemStack cobblestone_stairs = new ItemStack(Material.COBBLESTONE_STAIRS);
				ItemStack compass = new ItemStack(Material.COMPASS);
				ItemStack cooked_fish = new ItemStack(Material.COOKED_FISH);
				ItemStack cookie = new ItemStack(Material.COOKIE);
				ItemStack crops = new ItemStack(Material.CROPS);
				ItemStack dead_bush = new ItemStack(Material.DEAD_BUSH);
				ItemStack detector_rail = new ItemStack(Material.DETECTOR_RAIL);
				ItemStack diamond = new ItemStack(Material.DIAMOND);
				ItemStack diamond_axe = new ItemStack(Material.DIAMOND_AXE);
				ItemStack diamond_block = new ItemStack(Material.DIAMOND_BLOCK);
				ItemStack diamond_boots = new ItemStack(Material.DIAMOND_BOOTS);
				ItemStack diamond_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
				ItemStack diamond_helmet = new ItemStack(Material.DIAMOND_HELMET);
				ItemStack diamond_hoe = new ItemStack(Material.DIAMOND_HOE);
				ItemStack diamond_leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
				ItemStack diamond_ore = new ItemStack(Material.DIAMOND_ORE);
				ItemStack diamond_pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
				ItemStack diamond_spade = new ItemStack(Material.DIAMOND_SPADE);
				ItemStack diamond_sword = new ItemStack(Material.DIAMOND_SWORD);
				ItemStack diode = new ItemStack(Material.DIODE);
				ItemStack diode_block_off = new ItemStack(Material.DIODE_BLOCK_OFF);
				ItemStack diode_block_on = new ItemStack(Material.DIODE_BLOCK_ON);
				ItemStack dirt = new ItemStack(Material.DIRT);
				ItemStack dispenser = new ItemStack(Material.DISPENSER);
				ItemStack double_step = new ItemStack(Material.DOUBLE_STEP);
				ItemStack egg = new ItemStack(Material.EGG);
				ItemStack feather = new ItemStack(Material.FEATHER);
				ItemStack fence = new ItemStack(Material.FENCE);
				ItemStack fire = new ItemStack(Material.FIRE);
				ItemStack fishing_rod = new ItemStack(Material.FISHING_ROD);
				ItemStack flint = new ItemStack(Material.FLINT);
				ItemStack flint_and_steel = new ItemStack(Material.FLINT_AND_STEEL);
				ItemStack furnace = new ItemStack(Material.FURNACE);
				ItemStack glass = new ItemStack(Material.GLASS);
				ItemStack glowing_redstone_ore = new ItemStack(Material.GLOWING_REDSTONE_ORE);
				ItemStack glowstone = new ItemStack(Material.GLOWSTONE);
				ItemStack glostone_dust = new ItemStack(Material.GLOWSTONE_DUST);
				ItemStack gold_axe = new ItemStack(Material.GOLD_AXE);
				ItemStack gold_block = new ItemStack(Material.GOLD_BLOCK);
				ItemStack gold_boots = new ItemStack(Material.GOLD_BOOTS);
				ItemStack gold_chestplate = new ItemStack(Material.GOLD_CHESTPLATE);
				ItemStack gold_helmet = new ItemStack(Material.GOLD_HELMET);
				ItemStack gold_hoe = new ItemStack(Material.GOLD_HOE);
				ItemStack gold_ingot = new ItemStack(Material.GOLD_INGOT);
				ItemStack gold_leggings = new ItemStack(Material.GOLD_LEGGINGS);
				ItemStack gold_ore = new ItemStack(Material.GOLD_ORE);
				ItemStack gold_pickaxe = new ItemStack(Material.GOLD_PICKAXE);
				ItemStack gold_record = new ItemStack(Material.GOLD_RECORD);
				ItemStack gold_spade = new ItemStack(Material.GOLD_SPADE);
				ItemStack golden_apple = new ItemStack(Material.GOLDEN_APPLE);
				ItemStack grass = new ItemStack(Material.GRASS);
				ItemStack gravel = new ItemStack(Material.GRAVEL);
				ItemStack green_record = new ItemStack(Material.GREEN_RECORD);
				ItemStack grilled_pork = new ItemStack(Material.GRILLED_PORK);
				ItemStack ice = new ItemStack(Material.ICE);
				ItemStack ink_sack = new ItemStack(Material.INK_SACK);
				ItemStack iron_ = new ItemStack(Material.IRON_AXE);
				ItemStack iron_block = new ItemStack(Material.IRON_BLOCK);
				ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS);
				ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);
				ItemStack iron_door= new ItemStack(Material.IRON_DOOR);
				ItemStack iron_door_block = new ItemStack(Material.IRON_DOOR_BLOCK);
				ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET);
				ItemStack iron_hoe = new ItemStack(Material.IRON_HOE);
				ItemStack iron_ingot = new ItemStack(Material.IRON_INGOT);
				ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS);
				ItemStack iron_ore = new ItemStack(Material.IRON_ORE);
				ItemStack iron_pickaxe = new ItemStack(Material.IRON_PICKAXE);
				ItemStack iron_spade = new ItemStack(Material.IRON_SPADE);
				ItemStack iron_sword = new ItemStack(Material.IRON_SWORD);
				ItemStack jack_o_lantern = new ItemStack(Material.JACK_O_LANTERN);
				ItemStack jukebox = new ItemStack(Material.JUKEBOX);
				ItemStack ladder = new ItemStack(Material.LADDER);
				ItemStack lapis_block = new ItemStack(Material.LAPIS_BLOCK);
				ItemStack lapis_ore = new ItemStack(Material.LAPIS_ORE);
				ItemStack lava = new ItemStack(Material.LAVA);
				ItemStack lava_bucket = new ItemStack(Material.LAVA_BUCKET);
				ItemStack leather = new ItemStack(Material.LEATHER);
				ItemStack leather_boots = new ItemStack(Material.LEATHER_BOOTS);
				ItemStack leather_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
				ItemStack leather_helmet = new ItemStack(Material.LEATHER_HELMET);
				ItemStack leather_leggings = new ItemStack(Material.LEATHER_LEGGINGS);
				ItemStack leaves = new ItemStack(Material.LEAVES);
				ItemStack lever = new ItemStack(Material.LEVER);
				ItemStack locked_chest = new ItemStack(Material.LOCKED_CHEST);
				ItemStack log = new ItemStack(Material.LOG);
				ItemStack longs_grass = new ItemStack(Material.LONG_GRASS);
				ItemStack map = new ItemStack(Material.MAP);
				ItemStack milk_bucket = new ItemStack(Material.MILK_BUCKET);
				ItemStack minecart = new ItemStack(Material.MINECART);
				ItemStack mob_spawner = new ItemStack(Material.MOB_SPAWNER);
				ItemStack mossy_cobblestone = new ItemStack(Material.MOSSY_COBBLESTONE);
				ItemStack mushroom_soup = new ItemStack(Material.MUSHROOM_SOUP);
				ItemStack netherrack = new ItemStack(Material.NETHERRACK);
				ItemStack note_block = new ItemStack(Material.NOTE_BLOCK);
				ItemStack obsidian = new ItemStack(Material.OBSIDIAN);
				ItemStack painting = new ItemStack(Material.PAINTING);
				ItemStack paper = new ItemStack(Material.PAPER);
				ItemStack piston_base = new ItemStack(Material.PISTON_BASE);
				ItemStack pistonextension_ = new ItemStack(Material.PISTON_EXTENSION);
				ItemStack piston_moving_piece = new ItemStack(Material.PISTON_MOVING_PIECE);
				ItemStack piston_sticky_base = new ItemStack(Material.PISTON_STICKY_BASE);
				ItemStack pork = new ItemStack(Material.PORK);
				ItemStack portal = new ItemStack(Material.PORTAL);
				ItemStack powered_minecart = new ItemStack(Material.POWERED_MINECART);
				ItemStack powered_rail = new ItemStack(Material.POWERED_RAIL);
				ItemStack pumpkin = new ItemStack(Material.PUMPKIN);
				ItemStack rails = new ItemStack(Material.RAILS);
				ItemStack raw_fish = new ItemStack(Material.RAW_FISH);
				ItemStack red_mushroom = new ItemStack(Material.RED_MUSHROOM);
				ItemStack red_rose = new ItemStack(Material.RED_ROSE);
				ItemStack redstone = new ItemStack(Material.REDSTONE);
				ItemStack redstone_ore = new ItemStack(Material.REDSTONE_ORE);
				ItemStack redstone_torch_off = new ItemStack(Material.REDSTONE_TORCH_OFF);
				ItemStack redstone_torch_on = new ItemStack(Material.REDSTONE_TORCH_ON);
				ItemStack redstone_wire = new ItemStack(Material.REDSTONE_WIRE);
				ItemStack saddle = new ItemStack(Material.SADDLE);
				ItemStack sand = new ItemStack(Material.SAND);
				ItemStack sandstone = new ItemStack(Material.SANDSTONE);
				ItemStack sapling = new ItemStack(Material.SAPLING);
				ItemStack seeds = new ItemStack(Material.SEEDS);
				ItemStack shears = new ItemStack(Material.SHEARS);
				ItemStack sign = new ItemStack(Material.SIGN);
				ItemStack sign_post = new ItemStack(Material.SIGN_POST);
				ItemStack slime_ball = new ItemStack(Material.SLIME_BALL);
				ItemStack snow = new ItemStack(Material.SNOW);
				ItemStack snow_ball = new ItemStack(Material.SNOW_BALL);
				ItemStack snow_block = new ItemStack(Material.SNOW_BLOCK);
				ItemStack soil = new ItemStack(Material.SOIL);
				ItemStack soul_sand = new ItemStack(Material.SOUL_SAND);
				ItemStack sponge = new ItemStack(Material.SPONGE);
				ItemStack stationary_lava = new ItemStack(Material.STATIONARY_LAVA);
				ItemStack stationary_water = new ItemStack(Material.STATIONARY_WATER);
				ItemStack step = new ItemStack(Material.STEP);
				ItemStack stick = new ItemStack(Material.STICK);
				ItemStack stone  = new ItemStack(Material.STONE);
				ItemStack stone_axe = new ItemStack(Material.STONE_AXE);
				ItemStack stone_button = new ItemStack(Material.STONE_BUTTON);
				ItemStack stone_hoe = new ItemStack(Material.STONE_HOE);
				ItemStack stone_pickaxe = new ItemStack(Material.STONE_PICKAXE);
				ItemStack stone_plate = new ItemStack(Material.STONE_PLATE);
				ItemStack stone_spade = new ItemStack(Material.STONE_SPADE);
				ItemStack stone_sword = new ItemStack(Material.STONE_SWORD);
				ItemStack storage_minecart = new ItemStack(Material.STORAGE_MINECART);
				ItemStack string = new ItemStack(Material.STRING);
				ItemStack sugar = new ItemStack(Material.SUGAR);
				ItemStack sugar_cane = new ItemStack(Material.SUGAR_CANE);
				ItemStack sugar_cane_block = new ItemStack(Material.SUGAR_CANE_BLOCK);
				ItemStack sulphur = new ItemStack(Material.SULPHUR);
				ItemStack tnt = new ItemStack(Material.TNT);
				ItemStack torch = new ItemStack(Material.TORCH);
				ItemStack trap_door = new ItemStack(Material.TRAP_DOOR);
				ItemStack wall_sign = new ItemStack(Material.WALL_SIGN);
				ItemStack watch = new ItemStack(Material.WATCH);
				ItemStack water = new ItemStack(Material.WATER);
				ItemStack water_bucket = new ItemStack(Material.WATER_BUCKET);
				ItemStack web = new ItemStack(Material.WEB);
				ItemStack wheat = new ItemStack(Material.WHEAT);
				ItemStack wood = new ItemStack(Material.WOOD);
				ItemStack wood_axe = new ItemStack(Material.WOOD_AXE);
				ItemStack wood_door = new ItemStack(Material.WOOD_DOOR);
				ItemStack wood_hoe = new ItemStack(Material.WOOD_HOE);
				ItemStack wood_pickaxe = new ItemStack(Material.WOOD_PICKAXE);
				ItemStack wood_plate = new ItemStack(Material.WOOD_PLATE);
				ItemStack wood_spade = new ItemStack(Material.WOOD_SPADE);
				ItemStack wood_stairs = new ItemStack(Material.WOOD_STAIRS);
				ItemStack wood_sword = new ItemStack(Material.WOOD_SWORD);
				ItemStack wooden_door = new ItemStack(Material.WOODEN_DOOR);
				ItemStack wool = new ItemStack(Material.WOOL);
				ItemStack workbench = new ItemStack(Material.WORKBENCH);
				ItemStack yellow_flower = new ItemStack(Material.YELLOW_FLOWER);
				
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