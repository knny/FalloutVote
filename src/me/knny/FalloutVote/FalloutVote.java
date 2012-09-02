package me.knny.FalloutVote;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FalloutVote extends JavaPlugin {
	
	private static final Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() 
	{
		log.info("[FalloutVote] FalloutVote enabled!");	
	}
	
	public void onDisable() 
	{
		log.info("[FalloutVote] FalloutVote disabled!");	
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (!(sender instanceof Player)) return false;

		Player player = (Player) sender;

		if(cmd.getName().equalsIgnoreCase("vote")) 
		{
			if(!player.hasPermission("vote.command"))
			{
				player.sendMessage(ChatColor.RED + "You don't have permission to do this.");
				return true;
			}
			else
			{
		    		player.sendMessage(ChatColor.AQUA + player.getName() + ", please vote for us at the following sites. You will get one emerald per vote.\n" +
			        "\n" +
		    		"Planet Minecraft   -  www.test.com\n" +
		    		"Minestatus         -  www.test.com\n" +
		    		"Best Game Servers  -  www.test.com\n" +
		    		"\n" +
		    		"You may vote every 24 hours - Thanks for voting!");
		    		return true;
		    	}
		}
		return false;
		
	}
	
}