package xyz.larkyy.colorableitems.colorableitems;

public enum ColorableItems {

    HORSE_ARMOR(new ColorableHorseArmor()),
    HELMET(new ColorableArmor.ColorableHelmet()),
    CHESTPLATE(new ColorableArmor.ColorableChestplate()),
    LEGGINGS(new ColorableArmor.ColorableLeggings()),
    BOOTS(new ColorableArmor.ColorableLeggings()),
    POTION(new ColorablePotion()),
    SPLASH_POTION(new ColorablePotion.ColorableSplashPotion()),
    LINGERING_POTION(new ColorablePotion.ColorableLingeringPotion());

    private final ColorableItem item;
    ColorableItems(ColorableItem item) {
        this.item = item;
    }

    public ColorableItem getItem() {
        return item;
    }

}
