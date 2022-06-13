/*
 * All Rights Reserved (c) 2022 MoriyaShiine
 */

package moriyashiine.dracomelette.common;

import eu.midnightdust.lib.config.MidnightConfig;

public class ModConfig extends MidnightConfig {
	@Entry
	public static boolean spawnMultipleEggs = false;

	@Entry(min = 0, max = 1)
	public static float breakChance = 0.25F;
	@Entry(min = 0, max = 1)
	public static float teleportChance = 0.5F;
}