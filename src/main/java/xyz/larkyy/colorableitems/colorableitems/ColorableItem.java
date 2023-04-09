package xyz.larkyy.colorableitems.colorableitems;

import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;

public interface ColorableItem {

    ItemStack getItem();

    ItemStack getItem(int modelData);

    ItemStack getItem(Color color, int modelData);

}
