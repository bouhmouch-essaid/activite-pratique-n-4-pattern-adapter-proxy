package computer;

public class SuperVP implements Vga, Hdmi{
    @Override
    public void view(byte[] data) {
        String mesg = new String(data);
        System.out.println("-------- Super vp hdmi  --------");
        System.out.println(mesg);
        System.out.println("-------- Super VP hdmi  --------");
    }

    @Override
    public void print(String mesg) {
        System.out.println("-------- Super vp vga  --------");
        System.out.println(mesg);
        System.out.println("-------- Super vp vga  --------");
    }
}
