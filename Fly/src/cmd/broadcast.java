package cmd;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class broadcast implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("broadcast")){
			Player p = (Player) sender;
			
			if(p.hasPermission("foxxi.bc")){
				
				if(args.length == 0){
					
					p.sendMessage("§7[§cSystem§7] §cBitte benutze §6/broadcast <nachricht>§3!");
					return true;
					
				}
				String nachricht = "";
				for(int i = 0; i < args.length; i++){
					nachricht = nachricht + args[i] + " ";
				}
				nachricht = ChatColor.translateAlternateColorCodes('&', nachricht);
				Bukkit.broadcastMessage("§7[§cSystem§7] §2" + nachricht);
			}else{
				p.sendMessage("§cDazu hast du keine Rechte!");
			}
			
		}
		
		return true;
	}
	
	

}
