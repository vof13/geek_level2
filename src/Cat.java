public class Cat implements Humanable {

    private int heightLimit;
    private int lenghtLimit;
    private String name;

    public Cat(String name, int heightLimit, int lenghtLimit) {
        this.name = name;
        this.heightLimit = heightLimit;
        this.lenghtLimit = lenghtLimit;
    }

    @Override
    public void jump(int h)
    {
        Wall wall = new Wall();
        wall.wallJump(this, name, h, heightLimit);
    }

    @Override
    public void run(int l) {
        Treadmill treadmill = new Treadmill();
        treadmill.treadmillRuning(this, name, l, lenghtLimit);
    }
}
