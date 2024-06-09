package itzkiller.skyblockremake.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return; // Ensure clicked inventory is not null

        Player player = (Player) event.getWhoClicked();
        Inventory clickedInventory = event.getClickedInventory();
        ItemStack clickedItem = event.getCurrentItem();

        // Check if the clicked inventory is the custom GUI
        if (clickedInventory.getType() == InventoryType.CHEST) {
            event.setCancelled(true); // Prevent players from taking Items out of the GUI

            // Check if the clicked item is not null and is a demon sword
            if (clickedItem != null && clickedItem.getType() == Material.DIAMOND_SWORD &&
                    clickedItem.getItemMeta() != null &&
                    clickedItem.getItemMeta().getDisplayName().equals(ChatColor.RED+"DEMON SLAYER")) {
                // Give the player the clicked item
                player.getInventory().addItem(clickedItem);
                player.sendMessage(ChatColor.RED+"You obtained the Demon Slayer!");
            }
           else if (clickedItem != null && clickedItem.getType() == Material.DIAMOND_SWORD &&
                    clickedItem.getItemMeta() != null &&
                    clickedItem.getItemMeta().getDisplayName().equals(ChatColor.BLUE+"Aspect of the End")) {
                // Give the player the clicked item
                player.getInventory().addItem(clickedItem);
                player.sendMessage(ChatColor.BLUE + "You obtained the Aspect of the End!");
            }
                else if (clickedItem != null && clickedItem.getType() == Material.ENDER_EYE &&
                        clickedItem.getItemMeta() != null &&
                        clickedItem.getItemMeta().getDisplayName().equals(ChatColor.GREEN+"Enchanted Eye Of Ender")) {
                    // Give the player the clicked item
                    player.getInventory().addItem(clickedItem);
                    player.sendMessage(ChatColor.GREEN+"You obtained the Enchanted Eye Of Ender!");
            }
        }
    }
}
