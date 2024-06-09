package itzkiller.skyblockremake.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerUse(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack item = e.getItem();
        if (item != null && item.hasItemMeta()) {
            String n = item.getItemMeta().getDisplayName();
            if (n.equals(ChatColor.BLUE + "Aspect of the End")) {
                if (e.getAction().toString().contains("RIGHT_CLICK")) {
                    Location l = player.getLocation().add(player.getLocation().getDirection().multiply(8));
                    if (l.getBlock().getType() == Material.AIR) {
                        player.teleport(l);
                    } else
                        player.sendMessage(ChatColor.RED + "CANT USE INSTANT TRANSMISSION BLOCKS AHEAD");
                }
            }
        }

    }
}