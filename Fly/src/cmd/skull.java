package cmd;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class skull implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("skull")){
			
			if(p.hasPermission("foxxi.skull")){
				if(args.length == 1){
					@SuppressWarnings("deprecation")
					ItemStack item = new ItemStack(Material.getMaterial(397),1,(short)3);
					SkullMeta mitem = (SkullMeta) item.getItemMeta();
					
					mitem.setOwner(args[0]);
					item.setItemMeta(mitem);
					p.getInventory().addItem(item);
					p.sendMessage("§7[§cSystem§7] §3Du hast erfolgreich den Skull von §6" + mitem.getOwner() + " §3erhalten!");
				}
				}
			
			
			
		}
		return false;
	}

}
