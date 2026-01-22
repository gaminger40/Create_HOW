package net.gaminger40.Create_How.item;

import net.gaminger40.Create_How.Create_How;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Create_How.MODID);

    //barrels
    public static final RegistryObject<Item> Short_Barrel = Items.register("short_barrel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Medium_Barrel = Items.register("medium_barrel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Long_Barrel = Items.register("long_barrel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Pistol_Barrel = Items.register("pistol_barrel",
            () -> new Item(new Item.Properties()));
    //barrels end

    //weapon components

    public static final RegistryObject<Item> Pistol_Handle = Items.register("pistol_handle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Iron_Binding = Items.register("iron_binding",
            () -> new Item(new Item.Properties()));

    //weapon components end

    public static void register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
