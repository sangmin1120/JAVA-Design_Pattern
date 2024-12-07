package i_abstract_factory.연습1.screen;

import i_abstract_factory.연습1.map.Map;

public class HDScreen extends Screen{
    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map " + map.getClass().getName() + " on HD screen");
    }
}
