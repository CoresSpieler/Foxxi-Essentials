package cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tp implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("tp")){
			Player p = (Player)sender;
			
			
			if(p.hasPermission("foxxi.tp")){
				
				if(args.length == 1){
					String a = args[0];
					if(Bukkit.getPlayerExact(a) == null){
						p.sendMessage("§7[§cSystem§7] §cDer Spieler ist nicht online!");
						return false;
					}
					Player target = Bukkit.getPlayerExact(a);
					p.teleport(target.getLocation());
					p.sendMessage("§7[§cSystem§7] §3Du wurdest zum Spieler §6" + target.getDisplayName() + " §3telepotiert!");
					
				}else{
					p.sendMessage("§7[§cSystem§7] §cBenutze nur §6/tp [Spieler]§c!");
				}
				
			}else{
				p.sendMessage("§cDazu hast du keine Rechte!");
			}
		}if(cmd.getName().equalsIgnoreCase("tpall")){
			Player p = (Player)sender;
			if(p.hasPermission("foxxi.tpall")){
				if(args.length == 0){
					for(Player all : Bukkit.getOnlinePlayers()){
						all.teleport(p.getLocation());
						all.sendMessage("§7[§cSystem§7] §3Der Spieler §6" + p.getName() + " §3hat alle teleportiert!");
					}
				}else{
					p.sendMessage("§7[§cSystem§7] §cBenutze nur §6/tpall");
				}
			}else{
				p.sendMessage("§cDazu hast du keine Rechte!");
			}
		}
		
		
		return true;
	}
	
	

}
