package i_abstract_factory.연습1.factory;

public class FactoryFactory {
    public static Factory getFactory(Model model){
        Factory factory = null;
        switch (model){
            case Basic:
                factory = Basicfactory.getFactory();
                break;
            case Premiun:
                factory = PremiumFactory.getFactory();
                break;
        }

        return factory;
    }
}
