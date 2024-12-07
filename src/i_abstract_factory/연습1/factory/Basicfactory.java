package i_abstract_factory.연습1.factory;

import i_abstract_factory.연습1.gps.CheapGPS;
import i_abstract_factory.연습1.gps.GPS;
import i_abstract_factory.연습1.map.Map;
import i_abstract_factory.연습1.map.SmallMap;
import i_abstract_factory.연습1.path.Path;
import i_abstract_factory.연습1.path.PathFinder;
import i_abstract_factory.연습1.path.SlowPathFinder;
import i_abstract_factory.연습1.screen.SDScreen;
import i_abstract_factory.연습1.screen.Screen;

public class Basicfactory extends Factory{
    private static Factory factory;
    private Basicfactory(){}
    public static Factory getFactory(){
        if (factory == null){
            factory = new Basicfactory();
        }
        return new Basicfactory();
    }

    @Override
    public GPS createGps() {
        return new CheapGPS();
    }

    @Override
    public Map createMap() {
        return new SmallMap();
    }

    @Override
    public PathFinder createPath() {
        return new SlowPathFinder();
    }

    @Override
    public Screen createScreen() {
        return new SDScreen();
    }
}
