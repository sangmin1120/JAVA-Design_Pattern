package i_abstract_factory.연습1.path;

import i_abstract_factory.연습1.Location;

public class FastPathFinder extends PathFinder{

    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Fast Path Finder");
        return null;
    }
}
