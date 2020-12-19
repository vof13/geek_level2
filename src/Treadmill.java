public class Treadmill {
    public void treadmillRuning (Object ob, String name, int l, int lenghtLimit) {
        if (ob instanceof Humanable) {
            if (l <= lenghtLimit) {
                System.out.println(name + " пробежал " + l + " метров");
            } else {
                System.out.println(name + " не смог пробежать " + l + " метров  и выбывает.");
                Main.stopConditions();
            }
        }
    }
}
