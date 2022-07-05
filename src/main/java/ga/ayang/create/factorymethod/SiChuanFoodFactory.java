package ga.ayang.create.factorymethod;

public class SiChuanFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        if ("SCA".equals(name)) {
            return new SiChuanAFood();
        } else if ("SCB".equals(name)) {
            return new SiChuanBFood();
        } else {
            return null;
        }
    }
}
