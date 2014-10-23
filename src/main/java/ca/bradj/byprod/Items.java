package ca.bradj.byprod;

import ca.bradj.byprod.items.bones.MinersBones;
import ca.bradj.byprod.items.bones.Peanuts;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {

	private static final String DISSOLVER_NAME = "Dissolver";
	private static final int DISSOLVER_ID = 5001; //TODO: Pick better IDs
	
	private static final String MINERS_BONES_NAME = "Miners.Bones";
	private static final int MINERS_BONES_ID = 5002;
	
	private static final String PEANUTS_NAME = "Peanuts";
	private static final int PEANUTS_ID = 5003;
	
	public static MinersBones minersBones;
	public static Peanuts peanuts;

	public static void init() {
		GameRegistry.registerBlock(new Dissolver(DISSOLVER_ID), DISSOLVER_NAME);
		minersBones = OreCoreRegistration.registerBlock(new MinersBones(MINERS_BONES_ID), MINERS_BONES_NAME);
		peanuts = OreCoreRegistration.registerItem(new Peanuts(PEANUTS_ID), PEANUTS_NAME);
	}

}
