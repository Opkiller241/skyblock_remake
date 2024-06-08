package itzkiller.skyblockremake.utilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Customitems {
    public static ItemStack[] createitems(){


        ItemStack item1 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta1 = item1.getItemMeta();
        if (meta1 != null) {
            meta1.setDisplayName(ChatColor.RED + "DEMON SLAYER");
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.DARK_PURPLE+"UNOBTAINABLE SWORD");
            lore.add("");
            lore.add(ChatColor.YELLOW+"BEWARE DEMONS");
            lore.add(ChatColor.BLUE+"I AM BORED");
            meta1.setLore(lore);
            AttributeModifier d1 = new AttributeModifier("", 10000000000.0, AttributeModifier.Operation.ADD_NUMBER);
            meta1.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, d1);
            meta1.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            item1.setItemMeta(meta1);
        }

        ItemStack item2=new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta2= item2.getItemMeta();
        if(meta2!=null) {
            meta2.setDisplayName(ChatColor.BLUE+"Aspect of the End");
            List<String> lore2= new ArrayList<>();
            lore2.add(ChatColor.GRAY+"Damage:"+" "+ChatColor.RED+"+100");
            lore2.add(ChatColor.GRAY+"Strength:"+" "+ChatColor.RED+"+100");
            lore2.add(" ");
            lore2.add(ChatColor.GOLD+"Ability: Instant Transmission "+ChatColor.YELLOW+"RIGHT CLICK");
            lore2.add(ChatColor.GRAY+"Teleport "+ChatColor.GREEN+"8 Blocks "+ChatColor.GRAY+"ahead of you and");
            lore2.add(ChatColor.GRAY+"gain "+ChatColor.GREEN+"+50 "+ChatColor.WHITE+"✦Speed "+ChatColor.GRAY+"for "+ChatColor.GREEN+"3 Seconds"+ChatColor.GRAY+".");
            lore2.add(ChatColor.DARK_GRAY+"Mana Cost: "+ChatColor.DARK_AQUA+"50");
            lore2.add(" ");
            lore2.add(ChatColor.DARK_GRAY+"This item can be reforged!");
            lore2.add(ChatColor.BLUE+"RARE SWORD");
            meta2.setLore(lore2);
            meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            item2.setItemMeta(meta2);
        }

        ItemStack[] i=new ItemStack[]{item1,item2};
        return i;
    }
}
