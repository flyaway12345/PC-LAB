package PC;

public class PCTest {
    public static void main(String[] args) {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today ");
        Dimension dimension = new Dimension(20,55,5);
        Case cases = new Case("H420","Sony","240 volts",dimension);
        Resolution resolution = new Resolution(10,10);
        Monitor monitor = new Monitor(resolution,"HP","27 inch Beast");
        Motherboard motherboard = new Motherboard("BJ-300","Pentium",4,"v.244");
        PC pc = new PC(cases,motherboard,monitor);
        pc.description();
        pc.powerUp();

    }
}
