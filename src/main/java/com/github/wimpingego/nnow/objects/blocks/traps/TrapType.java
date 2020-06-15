package com.github.wimpingego.nnow.objects.blocks.traps;

import com.github.wimpingego.nnow.util.ModConfigs;

/*
@author: Naxanria

@edits: Wimpingego
*/
public class TrapType {
	static int I_Attack = ModConfigs.IRON_ATTACK_POWER.get();
	static int G_Attack = ModConfigs.GOLDERN_ATTACK_POWER.get();
	static int D_Attack = ModConfigs.DIAMOND_ATTACK_POWER.get();
	static int W_Attack = ModConfigs.WITHER_ATTACK_POWER.get();

	public static final TrapType FAKE = new TrapType("fake", 0, false, false, false);
	public static final TrapType IRON = new TrapType("iron", I_Attack, true, false, false);
	public static final TrapType GOLD = new TrapType("gold", G_Attack, true, false, true);
	public static final TrapType DIAMOND = new TrapType("diamond", D_Attack, true, true, true);
	public static final TrapType WITHER = new TrapType("wither", W_Attack, true, true, true);

	public final String name;
	public final float damage;
	public final boolean lethal;
	public final boolean isPlayer;
	public final boolean dropXP;

	public TrapType(String name, float damage, boolean lethal, boolean dropXP, boolean isPlayer) {
		this.name = name;
		this.damage = damage;
		this.lethal = lethal;
		this.dropXP = dropXP;
		this.isPlayer = isPlayer;
	}
}
