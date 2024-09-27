package net.chilletize.mccourse;

import net.chilletize.mccourse.block.ModBlocks;
import net.chilletize.mccourse.item.ModItemGroup;
import net.chilletize.mccourse.item.ModItems;
import net.chilletize.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}