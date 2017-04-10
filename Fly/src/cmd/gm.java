package cmd;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gm implements CommandExecutor{

	@SuppressWarnings("null")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("gm")){
			
			Player p = (Player)sender;
			
			if(p.hasPermission("foxxi.gm")){
				
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("3")){
						if(args[0].equalsIgnoreCase("0")){
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Survival-Modus§3!");
						}else if(args[0].equalsIgnoreCase("1")){
							p.setGameMode(GameMode.CREATIVE);
							p.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Kreativ-Modus§3!");
						}else if(args[0].equalsIgnoreCase("2")){
							p.setGameMode(GameMode.ADVENTURE);
							p.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Adventure-Modus§3!");
						}else if(args[0].equalsIgnoreCase("3")){
							p.setGameMode(GameMode.SPECTATOR);
							p.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Zuschauer-Modus§3!");
						}
						
					}
				}else if(args.length == 2){
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null){
						if(args[1].equalsIgnoreCase("0") || args[1].equalsIgnoreCase("1") || args[1].equalsIgnoreCase("2") || args[1].equalsIgnoreCase("3")){
							if(args[1].equalsIgnoreCase("0")){
								target.setGameMode(GameMode.SURVIVAL);
								target.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Survival-Modus§3!");
							}else if(args[1].equalsIgnoreCase("1")){
								target.setGameMode(GameMode.CREATIVE);
								target.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Kreativ-Modus§3!");
							}else if(args[1].equalsIgnoreCase("2")){
								target.setGameMode(GameMode.ADVENTURE);
								target.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Adventure-Modus§3!");
							}else if(args[1].equalsIgnoreCase("3")){
								target.setGameMode(GameMode.SPECTATOR);
								target.sendMessage("§7[§cSystem§7] §3Du bist nun im §6Zuschauer-Modus§3!");
							}
						}
						}else{
						p.sendMessage("§7[§cSystem§7] §cDer Spieler " + target.getName() +  " ist nicht online!");
					}
				}else{
					p.sendMessage("§cDu musst die richtigen Parameter angeben: §6/gamemode [Spieler] <0/1/2/3>");
				}
			
			
		}else{
			p.sendMessage("§cDazu hast du keine Rechte!");
		}
		
		
		
	}
		return true;
	
	

	}
}
