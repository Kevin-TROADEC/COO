import Interfaces.Component;

public class Main {
    public static void main(String[] args) {
        Component i7 = new CPU("Intel i7 gen 13", 200, 4700);
        Component Ram4GB = new RAM("Barette de RAM 4GB", 50, 4096);
        Composite GPU = new Composite("RTX4090");
        Component CpuGPU = new CPU("Processeur NVIDIA", 300, 3000);
        Component RAMGRPU = new RAM("VRAM NVIDIA", 200, 8192);

        GPU.add(CpuGPU);
        GPU.add(RAMGRPU);

        Composite PC = new Composite("PC");

        PC.add(i7);
        PC.add(Ram4GB);
        PC.add(Ram4GB);
        PC.add(GPU);

        System.out.println(PC.getPrice());

    }
}