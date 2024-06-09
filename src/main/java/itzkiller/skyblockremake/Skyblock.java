package itzkiller.skyblockremake;

import itzkiller.skyblockremake.commands.Items;
import itzkiller.skyblockremake.events.EyeOfEnder;
import itzkiller.skyblockremake.events.PlayerInteractListener;
import itzkiller.skyblockremake.events.InventoryClickListener;
import itzkiller.skyblockremake.utilities.RecipeManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Skyblock extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PLUGIN HAS STARTED ENJOY!!!");
        // Register the event listener
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(),this);
        getServer().getPluginManager().registerEvents(new EyeOfEnder(),this);

        // Register commands
        getCommand("Items").setExecutor(new Items());

        // Register the crafting recipes suggested by my friend

        RecipeManager recipe=new RecipeManager();
        recipe.aoteRecipe(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
