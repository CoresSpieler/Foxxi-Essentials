package listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class listener implements Listener{
	
	public void onJoin(PlayerJoinEvent e){
		
		Player p = e.getPlayer();
		if(p.hasPermission("fly")){
		p.getInventory().setItem(6, new ItemStack(Material.FEATHER, 1));
		
		}
	}
	
	public void onClick(InventoryClickEvent e){
		e.setCancelled(true);
		
	}
	
	public void onDrop(InventoryMoveItemEvent e){
		e.setCancelled(true);
	}
	
	public void onInteract(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			Player p = e.getPlayer();
			if(e.getMaterial().equals(Material.FEATHER)){
			p.setAllowFlight(true);
			
			}
		}
	}

}
