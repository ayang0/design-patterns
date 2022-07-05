package ga.ayang.create.abstractfactory;

public class AMDComputerFactory implements ComputerFactory{
    @Override
    public CPU makeCPU() {
        return new AMDCPU();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new AMDHardDisk();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AMDMainBoard();
    }
}
