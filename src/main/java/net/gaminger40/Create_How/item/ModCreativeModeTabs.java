package net.gaminger40.Create_How.item;

import net.gaminger40.Create_How.Create_How;
import net.gaminger40.Create_How.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.windows.POINT;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Create_How.MODID);

    public static final RegistryObject<CreativeModeTab> Create_How_Tab = CREATIVE_MODE_TABS.register("create_how_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Long_Barrel.get()))
                    .title(Component.translatable("creativetab.create_how_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //items
                        pOutput.accept(ModItems.Iron_Binding.get());
                        pOutput.accept(ModItems.Long_Barrel.get());
                        pOutput.accept(ModItems.Medium_Barrel.get());
                        pOutput.accept(ModItems.Pistol_Barrel.get());
                        pOutput.accept(ModItems.Pistol_Handle.get());
                        pOutput.accept(ModItems.Short_Barrel.get());
                        pOutput.accept(ModItems.Tungsten_Ingot.get());
                        //blocks
                        pOutput.accept(ModBlocks.Tungsten_Ore.get());
                        pOutput.accept((ModBlocks.Deepslate_Tungsten_Ore.get()));
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
