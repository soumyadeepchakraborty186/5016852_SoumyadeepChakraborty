
public class Computer {
    private String CPU;
    private int RAM; 
    private int storage; 
    private String GPU;
    private String OS;

    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.OS = builder.OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                "GB, storage=" + storage +
                "GB, GPU='" + GPU + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }

    
    public static class Builder {
        private String CPU;
        private int RAM; 
        private int storage; 
        private String GPU;
        private String OS;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
