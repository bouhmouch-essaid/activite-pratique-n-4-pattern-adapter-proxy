package computer;

public class UniteCentre implements Vga {
    private Vga vga;

    public void print(String mesg){
        System.out.println("---------- uc---------- ");
        vga.print(mesg);
        System.out.println("---------- /uc---------- ");
    }

    public void setVga(Vga vga){
        this.vga=vga;

    }
}
