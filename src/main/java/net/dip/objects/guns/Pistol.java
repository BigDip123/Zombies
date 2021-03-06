package net.dip.objects.guns;

import org.bukkit.Material;

public class Pistol extends Gun {

    private static final String GUN_NAME = "Pistol";
    private static final Material GUN_OBJECT = Material.WOODEN_HOE;

    private static final double DAMAGE = 6.0;
    private static final int AMMO = 300;
    private static final int CLIP_AMMO = 10;
    private static final double FIRE_RATE = 0.5;
    private static final double RELOAD_RATE = 1.5;

    public Pistol(){
        super(GUN_NAME, GUN_OBJECT, DAMAGE, AMMO, CLIP_AMMO, FIRE_RATE, RELOAD_RATE);
        setDescription("This is your starter gun. You're",
                "gonna want to upgrade this at",
                "some point.");
    }
}
