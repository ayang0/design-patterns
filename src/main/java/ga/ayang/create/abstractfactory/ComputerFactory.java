package ga.ayang.create.abstractfactory;

public interface ComputerFactory {
    CPU makeCPU();
    HardDisk makeHardDisk();
    MainBoard makeMainBoard();
}
