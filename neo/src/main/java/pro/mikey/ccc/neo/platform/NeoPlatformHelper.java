package pro.mikey.ccc.neo.platform;

import pro.mikey.ccc.platform.services.IPlatformHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class NeoPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Neo";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }
}
