package i_abstract_factory.연습1.factory;

import i_abstract_factory.연습1.gps.ExpensiveGPS;
import i_abstract_factory.연습1.gps.GPS;
import i_abstract_factory.연습1.map.LargeMap;
import i_abstract_factory.연습1.map.Map;
import i_abstract_factory.연습1.path.FastPathFinder;
import i_abstract_factory.연습1.path.PathFinder;
import i_abstract_factory.연습1.screen.HDScreen;
import i_abstract_factory.연습1.screen.Screen;

public class PremiumFactory extends Factory{
    private static Factory factory;
    private PremiumFactory() {}
    public static Factory getFactory() {
        if (factory == null) {
            factory = new PremiumFactory();
        }
        return factory;
    }
    @Override
    public GPS createGps() {
        return new ExpensiveGPS();
    }

    @Override
    public Map createMap() {
        return new LargeMap();
    }

    @Override
    public PathFinder createPath() {
        return new FastPathFinder();
    }

    @Override
    public Screen createScreen() {
        return new HDScreen();
    }
}
