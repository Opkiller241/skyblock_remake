package itzkiller.skyblockremake;

import itzkiller.skyblockremake.commands.items;
import itzkiller.skyblockremake.events.aote;
import itzkiller.skyblockremake.events.guiListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PLUGIN IS STARTING");
        // Register the event listener
        getServer().getPluginManager().registerEvents(new guiListeners(), this);
        getServer().getPluginManager().registerEvents(new aote(),this);
        getCommand("items").setExecutor(new items());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
