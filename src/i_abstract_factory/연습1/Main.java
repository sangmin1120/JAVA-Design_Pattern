package i_abstract_factory.연습1;

import i_abstract_factory.연습1.factory.*;
import i_abstract_factory.연습1.gps.*;
import i_abstract_factory.연습1.map.*;
import i_abstract_factory.연습1.path.*;
import i_abstract_factory.연습1.screen.*;

public class Main {
    public static void main(String[] args) {
//        GPS gps = new CheapGPS();
//        Screen mapScreen = new SDScreen();
//        PathFinder pathFinder = new SlowPathFinder();
//
//        Map map = new SmallMap();
//        mapScreen.drawMap(map);
//
//        Location l1 = gps.findCurrentLocation();
//        Location l2 = gps.findCurrentLocation();
        Factory factory = FactoryFactory.getFactory(Model.Basic);

        GPS gps = factory.createGps();
        Screen screen = factory.createScreen();
        PathFinder pathFinder = factory.createPath();
        Map map = factory.createMap();
        screen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }
}
