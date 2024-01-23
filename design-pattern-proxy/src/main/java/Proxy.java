import java.util.Random;

public class Proxy implements Standard{
    private StandardImpl1 target = new StandardImpl1();
    @Override
    public void process() {
        System.out.println("Security context verification");
        boolean b = new Random().nextBoolean();
        if (b) {
            System.out.println("Before the call");
            target = new StandardImpl1();
            target.process();
            System.out.println("After the call");
        } else {
            throw new RuntimeException("Forbidden 403");
        }
    }

}
