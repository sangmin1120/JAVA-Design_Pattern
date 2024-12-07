package i_abstract_factory.연습1.factory;

import i_abstract_factory.연습1.gps.*;
import i_abstract_factory.연습1.map.*;
import i_abstract_factory.연습1.path.Path;
import i_abstract_factory.연습1.path.PathFinder;
import i_abstract_factory.연습1.screen.Screen;


public abstract class Factory {
    public abstract GPS createGps();
    public abstract Map createMap();
    public abstract PathFinder createPath();
    public abstract Screen createScreen();
}
