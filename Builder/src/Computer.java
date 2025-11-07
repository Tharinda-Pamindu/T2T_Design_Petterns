public class Computer {
    private String cpu;
    private int ram;
    private double storage;
    private String graphicCard;

    public Computer(String cpu, int ram, double storage, String graphicCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }

    public static class Builder{
        private String cpu;
        private int ram;
        private double storage;
        private String graphicCard;

        public Computer build(){
            return new Computer(cpu, ram, storage, graphicCard);
        }

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(double storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

    }

}
