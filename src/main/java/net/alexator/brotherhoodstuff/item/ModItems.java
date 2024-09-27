package net.alexator.brotherhoodstuff.item;

import net.alexator.brotherhoodstuff.BrotherHoodStuffMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrotherHoodStuffMod.MOD_ID);


    //
    public  static  final RegistryObject<Item> BLOODTHERITE_INGOT = ITEMS.register("bloodtherite_ingot",
            ()-> new Item(new Item.Properties()));
    public  static  final RegistryObject<Item> RAW_BLOODTHERITE = ITEMS.register("raw_bloodtherite",
            ()-> new Item(new Item.Properties()));



    public static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
