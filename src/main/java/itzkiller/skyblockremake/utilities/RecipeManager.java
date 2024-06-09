package itzkiller.skyblockremake.utilities;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class RecipeManager {

    // Recipes for all custom items will be here

    public void aoteRecipe(Plugin plugin) {
        ItemStack[] it = CustomItems.createItems();
        for (ItemStack items : it) {
            if (items != null && items.hasItemMeta() && items.getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Aspect of the End")) {
                NamespacedKey key1 = new NamespacedKey(plugin, "aote");
                ShapedRecipe r1 = new ShapedRecipe(key1, items);
                r1.shape(" E ", " E ", " S ");
                r1.setIngredient('E', Material.ENDER_PEARL);
                r1.setIngredient('S', Material.STICK);
                Bukkit.addRecipe(r1);
                return;
            }
        }
    }
}