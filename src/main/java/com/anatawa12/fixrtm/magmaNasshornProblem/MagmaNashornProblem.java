package com.anatawa12.fixrtm.magmaNasshornProblem;

import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = MagmaNashornProblem.MOD_ID,
        name = MagmaNashornProblem.MOD_NAME,
        version = MagmaNashornProblem.VERSION
)
public class MagmaNashornProblem {
    public static final String MOD_ID = "magma-nashorn-problem-reproduce";
    public static final String MOD_NAME = "Magma Nashorn Problem Reproduce";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        Launch.classLoader.addClassLoaderExclusion("jdk.nashorn.");
        new jdk.nashorn.api.scripting.NashornScriptEngineFactory().getScriptEngine();
    }
}
