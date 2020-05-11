package sekelsta.horse_tack;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TackItem extends Item {
    String name;
    public TackItem(String name) {
        this.name = name;
        setRegistryName(name);
        setUnlocalizedName(HorseTack.MODID + "." + name);
        setCreativeTab(ModItems.creativeTab);
    }

    @Override
    public String getHorseArmorTexture(EntityLiving wearer, ItemStack stack) {
        return HorseTack.MODID + ":textures/entity/horse/armor/" + name + ".png";
    }

    @Override
    public HorseArmorType getHorseArmorType(ItemStack stack) {
        //System.out.println(HorseArmorType.getByName("decorative"));
        return HorseArmorType.getByName("decorative");
    }
}
