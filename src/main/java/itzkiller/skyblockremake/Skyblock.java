package itzkiller.skyblockremake;

import itzkiller.skyblockremake.commands.Items;
import itzkiller.skyblockremake.events.PlayerInteractListener;
import itzkiller.skyblockremake.events.InventoryClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Skyblock extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PLUGIN IS STARTING");
        // Register the event listener
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(),this);
        getCommand("Items").setExecutor(new Items());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
