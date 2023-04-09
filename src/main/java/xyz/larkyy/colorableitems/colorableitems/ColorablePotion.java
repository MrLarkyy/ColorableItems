package xyz.larkyy.colorableitems.colorableitems;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;

public class ColorablePotion implements ColorableItem {

    private static ItemStack getColoredItem(Material material, Color color, int modelData) {
        ItemStack is = new ItemStack(material);
        PotionMeta lam = (PotionMeta) is.getItemMeta();
        if (color != null) {
            lam.setColor(color);
        }
        if (modelData > 0) {
            lam.setCustomModelData(modelData);
        }
        is.setItemMeta(lam);
        return is;
    }

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
        return getColoredItem(Material.POTION,color,modelData);
    }

    public static class ColorableSplashPotion implements ColorableItem {

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
            return getColoredItem(Material.SPLASH_POTION,color,modelData);
        }
    }
    public static class ColorableLingeringPotion implements ColorableItem {

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
            return getColoredItem(Material.LINGERING_POTION,color,modelData);
        }
    }
}
