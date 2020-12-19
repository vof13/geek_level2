public class Wall {

    public void wallJump (Object ob, String name, int h, int heightLimit) {
        if (ob instanceof Humanable) {
            if (h <= heightLimit) {
                System.out.println(name + " прыгнул на " + h + " метров");
            } else {
                System.out.println(name + " не прыгнет на " + h + " метров и выбывает.");
                Main.stopConditions();
            }
        }
    }

}
