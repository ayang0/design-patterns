package ga.ayang.create.abstractfactory;

public class IntelHardDisk implements HardDisk{
    @Override
    public void printHardDiskInfo() {
        System.out.println("这是Intel 硬盘: 1T");
    }
}
