package ga.ayang.create.factorymethod;

public class ShangHaiFoodFactory implements FoodFactory{

    @Override
    public Food makeFood(String name) {
        if ("SHA".equals(name)) {
            return new ShangHaiAFood();
        } else if ("SHB".equals(name)) {
            return new ShangHaiBFood();
        } else {
            return null;
        }
    }
}
