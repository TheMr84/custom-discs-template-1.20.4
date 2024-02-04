package luhjak.customdiscs.item;

import luhjak.customdiscs.CustomDiscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DISK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomDiscs.MOD_ID,"disk1"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.disks"))
            .icon(() -> new ItemStack(ModItems.DISK1)).entries((displayContext, entries) -> {

                //add items to the Disks group here you retard. order matters too.
                entries.add(ModItems.DISK1);
                entries.add(ModItems.DISK2);


            }).build());
    public static void registerItemGroups(){
        CustomDiscs.LOGGER.info("Registry for Item Groups for " + CustomDiscs.MOD_ID);
    }

}
