package ga.ayang.create.abstractfactory;

public class Computer {
    private CPU cpu;
    private HardDisk hardDisk;
    private MainBoard mainBoard;

    private Computer(CPU cpu, HardDisk hardDisk, MainBoard mainBoard) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.mainBoard = mainBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void printComputerInfo() {
        cpu.printCPUInfo();
        hardDisk.printHardDiskInfo();
        mainBoard.printMainBoardInfo();
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    /**
     * 使用lombok的@Builder注解可能是更好的方式
     */
    public static class ComputerBuilder {
        private CPU cpu;
        private HardDisk hardDisk;
        private MainBoard mainBoard;

        public ComputerBuilder CPU(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder hardDisk(HardDisk hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }
        public ComputerBuilder mainBoard(MainBoard mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Computer build() {
            // 判断字段合法性


            return new Computer(cpu, hardDisk, mainBoard);
        }
    }
}
