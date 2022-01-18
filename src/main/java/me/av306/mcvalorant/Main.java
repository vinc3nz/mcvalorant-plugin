package me.av306.mcvalorant;

import me.av306.mcvalorant.commands.*;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main extends JavaPlugin
{
	public static final String ID = "MCValorant";
	
  public static Server server;
  public static final Logger LOGGER = LogManager.getLogger( ID );

	public static final ChatColor SUCCESS = ChatColor.GREEN;
	public static final ChatColor WARNING = ChatColor.YELLOW;
	public static final ChatColor ERROR = ChatColor.RED;
	public static final ChatColor INFO = ChatColor.AQUA;
  
  
  @Override
  public void onEnable()
  {
    server = this.getServer(); // get server brand
  
    LOGGER.info( "MCValorant is initialising! Have fun!" );
    
  	//this.getCommand( "example" ).setExecutor( new ExampleCommand() ); // register command with name "example" defined in plugin.yml
  }
  
  
  @Override
  public void onDisable() {}
}
