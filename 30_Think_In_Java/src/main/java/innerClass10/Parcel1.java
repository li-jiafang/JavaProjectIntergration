package innerClass10;

/**
 * @author: ljf
 * @create: 2021/5/10 17:02
 * @description:
 **/
public class Parcel1 {

    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        System.out.println(c.value());
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }

}
