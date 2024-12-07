package i_abstract_factory.연습1.path;

import i_abstract_factory.연습1.Location;

public class SlowPathFinder extends PathFinder{
    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}
