package ca.bradj.byprod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = ByProducts.MODID, version = ByProducts.VERSION)
public class ByProducts {

    @SidedProxy(clientSide="ca.bradj.byprod.ClientProxy", serverSide="ca.bradj.byprod.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "byprod";
    public static final String VERSION = "0.1.0";

	public static CreativeTabs tabByProducts = new CreativeTabs("tabByProducts") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(Items.minersBones);
	    }
	};

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        ByProducts.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        ByProducts.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        ByProducts.proxy.postInit(e);
    }
}
