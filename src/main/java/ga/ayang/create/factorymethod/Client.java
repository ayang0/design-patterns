package ga.ayang.create.factorymethod;

public class Client {
    public static void main(String[] args) {
        FoodFactory siChuanFoodFactory = new SiChuanFoodFactory();
        Food sca = siChuanFoodFactory.makeFood("SCA");
        sca.desc();
    }
}
