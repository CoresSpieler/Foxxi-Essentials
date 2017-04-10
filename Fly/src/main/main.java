package main;

import org.bukkit.plugin.java.JavaPlugin;

import cmd.broadcast;
import cmd.cmd;
import cmd.gm;
import cmd.skull;
import cmd.tp;

public class main extends JavaPlugin{
	

	
	
	public void onEnable() {
		// TODO
		// fly
		// gamemode !!!!
		// give
		// skull !!!!
		// broadcast !!!!
		// kill
		// tp !!!!
		// tpall !!!!
		getCommand("vanish").setExecutor(new cmd());
		getCommand("gm").setExecutor(new gm());
		getCommand("skull").setExecutor(new skull());
		getCommand("broadcast").setExecutor(new broadcast());
		getCommand("tp").setExecutor(new tp());
		getCommand("tpall").setExecutor(new tp());
		
	}
	
	

}
