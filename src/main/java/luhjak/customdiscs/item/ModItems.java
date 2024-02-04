package luhjak.customdiscs.item;

import luhjak.customdiscs.CustomDiscs;
import luhjak.customdiscs.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DISK1 = registerItem("disk1", new MusicDiscItem(8, ModSounds.DISK1_AUDIO, new FabricItemSettings().maxCount(1), 157));
    //the very last number is the duration of the disk audio IN SECONDS!!!!

    public static final Item DISK2 = registerItem("disk2", new Item(new FabricItemSettings()));
//disk1 needs to be the name of the model>item>disk1.json to work
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

        //old code that put the disks in the ingredients tab: entries.add(DISK1);
        //old code that put the disks in the ingredients tab: entries.add(DISK2);

    }
    private static Item registerItem(String name, Item item)
    {

        return Registry.register(Registries.ITEM, new Identifier(CustomDiscs.MOD_ID, name), item);

    }

    public static void registerModItems()
    {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

        CustomDiscs.LOGGER.info("Registry for " + CustomDiscs.MOD_ID);
    }
}
