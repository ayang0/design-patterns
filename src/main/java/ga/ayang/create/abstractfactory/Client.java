package ga.ayang.create.abstractfactory;

public class Client {
    public static void main(String[] args) {
        // 工厂
        ComputerFactory factory = new IntelComputerFactory();
        // 从工厂中拿到电脑配件
        CPU cpu = factory.makeCPU();
        MainBoard mainBoard = factory.makeMainBoard();
        HardDisk hardDisk = factory.makeHardDisk();
        // 根据配件创建电脑
        Computer intelComputer = Computer.builder().CPU(cpu).hardDisk(hardDisk).mainBoard(mainBoard).build();
        intelComputer.printComputerInfo();
    }
}
