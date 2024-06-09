package itzkiller.skyblockremake.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class EyeOfEnder implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        ItemStack item=e.getItem();
        if(item!=null && item.hasItemMeta() && item.getItemMeta().getDisplayName().equals(ChatColor.GREEN+"Enchanted Eye Of Ender")) {
            e.setCancelled(true);
        }
    }
}
