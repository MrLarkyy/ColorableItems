package xyz.larkyy.colorableitems.colorableitems;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ColorableHorseArmor implements ColorableItem {
    private final Material material = Material.LEATHER_HORSE_ARMOR;

    @Override
    public ItemStack getItem() {
        return getItem(-1);
    }

    @Override
    public ItemStack getItem(int modelData) {
        return getItem(null,modelData);
    }

    @Override
    public ItemStack getItem(Color color, int modelData) {
        ItemStack is = new ItemStack(material);
        LeatherArmorMeta lam = (LeatherArmorMeta) is.getItemMeta();
        if (color != null) {
            lam.setColor(color);
        }
        if (modelData > 0) {
            lam.setCustomModelData(modelData);
        }
        is.setItemMeta(lam);
        return is;
    }
}
