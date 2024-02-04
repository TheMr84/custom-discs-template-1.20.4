package luhjak.customdiscs;

import luhjak.customdiscs.datagen.ModItemTagProvider;
import luhjak.customdiscs.item.ModItemGroups;
import luhjak.customdiscs.item.ModItems;
import luhjak.customdiscs.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomDiscs implements ModInitializer {
	public static final String MOD_ID = "custom-discs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}