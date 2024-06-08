package itzkiller.skyblockremake.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import itzkiller.skyblockremake.utilities.Customitems;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class items implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player) {

           Player p =(Player) sender;
            Inventory ci= Bukkit.createInventory(p,54, ChatColor.GOLD+"CUSTOM ITEMS");
            ItemStack[] it= Customitems.createitems();
            for (ItemStack items : it) {
                ci.addItem(items);
            }
              p.openInventory(ci);
        }
        return true;
    }
}
