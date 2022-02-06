package me.av306.mcvalorant;

import me.av306.mcvalorant.commands.*;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main extends JavaPlugin {
	public static final String ID = "MCValorant";
    public static String PREFIX;
    public static String PLUGINVERSION;
	
    public static Server server;
    public static String SERVERVERSION;
    public static final Logger LOGGER = LogManager.getLogger( ID );

    public static FileConfiguration config;

	public static final ChatColor SUCCESS = ChatColor.GREEN;
	public static final ChatColor WARNING = ChatColor.YELLOW;
	public static final ChatColor ERROR = ChatColor.RED;
	public static final ChatColor INFO = ChatColor.AQUA;
  
  
  @Override
  public void onEnable()
  {
      server = this.getServer(); // get server brand
      this.saveDefaultConfig();
      config = this.getConfig();
      PLUGINVERSION = this.getDescription().getVersion();
      PLUGINVERSION = Tools.format("&7[&6MCV&7] "); // After initialisation of config
      SERVERVERSION = server.getVersion(); // After initialisation of sever
    LOGGER.info( "MCValorant is initialising! Have fun!" );
    LOGGER.info("Server Version: " + SERVERVERSION + ", Plugin Version: " + PLUGINVERSION);
  	//this.getCommand( "example" ).setExecutor( new ExampleCommand() ); // register command with name "example" defined in plugin.yml
      this.getCommand("mcvalorant").setExecutor(new CommandDispatcher());
  }
  
  
  @Override
  public void onDisable() {}
}
