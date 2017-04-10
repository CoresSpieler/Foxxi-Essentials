package cmd;


import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



public class cmd implements CommandExecutor{
	
	public ArrayList<Player> visibility = new ArrayList<Player>();
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg1.getName().equalsIgnoreCase("vanish")){
		
			
	
	     Player p = (Player)arg0;
	     if(p.hasPermission("foxxi.vanish")){
        if (visibility.contains(p)) {
            visibility.remove(p);
            for (Player all : Bukkit.getOnlinePlayers()) {
                if (!p.canSee(all) && !visibility.contains(all))
                    p.showPlayer(all);

                if (!all.canSee(p) && p != all)
                    all.showPlayer(p);
            }
            p.sendMessage("§7[§cSystem§7] §3Du bist jetzt §6sichtbar§3!");
            p.removePotionEffect(PotionEffectType.INVISIBILITY);
            
        } else {
            visibility.add(p);
            for (Player all : Bukkit.getOnlinePlayers()) {
                if (!p.canSee(all) && !visibility.contains(all))
                    p.showPlayer(all);

                if (all.canSee(p) && all != p)
                    all.hidePlayer(p);
            }
            p.sendMessage("§7[§cSystem§7] §3Du bist jetzt §6unsichtbar§3!");
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,30000000,30000000));
        
        
    }

	}
		}
	
		return false;
	}

}
