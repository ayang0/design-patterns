package ga.ayang.create.abstractfactory;

public class IntelCPU implements CPU{
    @Override
    public void printCPUInfo() {
        System.out.println("这是Intel CPU: 8核16线程");
    }
}
