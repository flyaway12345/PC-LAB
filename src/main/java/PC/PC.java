package PC;

public class PC {
    private Case cases;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case cases, Motherboard motherboard, Monitor monitor) {
        this.cases = cases;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(){
        monitor.drawPixelAt(5,5,"red");
    }
    public void description(){
        System.out.println(toString());
    }
    public void powerUp(){
        cases.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows XP");
    }
    @Override
    public String toString() {
        return "PC{" +
                "cases=" + cases +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}
