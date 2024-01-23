package computer;

public class Ecran implements Vga {

    @Override
    public void print(String mesg) {
        System.out.println("---Ecran---");
        System.out.println(mesg);
        System.out.println("---Ecran---");
    }
}
