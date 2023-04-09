package xyz.larkyy.colorableitems.colorableitems;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ColorableArmor {

    private ColorableArmor() {

    }

    private static ItemStack getColoredItem(Material material, Color color, int modelData) {
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

    public static class ColorableHelmet implements ColorableItem {

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
            return getColoredItem(Material.LEATHER_HELMET,color,modelData);
        }
    }

    public static class ColorableChestplate implements ColorableItem {

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
            return getColoredItem(Material.LEATHER_CHESTPLATE,color,modelData);
        }
    }

    public static class ColorableLeggings implements ColorableItem {

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
            return getColoredItem(Material.LEATHER_LEGGINGS,color,modelData);
        }
    }

    public static class ColorableBoots implements ColorableItem {

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
            return getColoredItem(Material.LEATHER_BOOTS,color,modelData);
        }
    }

}
