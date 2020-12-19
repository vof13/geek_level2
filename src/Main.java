import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean conditions;

    private static Humanable human;
    private static Humanable cat;
    private static Humanable robot;




    public static void main(String[] args) {
        int[][] let = new int[2][3];
        // первая строка массива высота стены, вторая - длина дорожки
        for (int i = 0; i < 3; i++) {
            System.out.println("ведите высоту " + (i+1) + " стены:");
            let[0][i] = scanner.nextInt();
            System.out.println("ведите длину " + (i+1) + " беговой дорожки");
            let[1][i] = scanner.nextInt();
        }

        Humanable[] humanables = new Humanable[3];
        humanables[0] = new Cat("Кот", 10, 100);
        humanables[1] = new Human("Человек", 20, 200);
        humanables[2] = new Robot("Робот", 30, 300);

        for (int i = 0; i < humanables.length; i++) {
            conditions = true;
            for (int j = 0; j <= let.length; j++) {
                if (conditions) {
                    humanables[i].jump(let[0][j]);
                }
                if (conditions) {
                    humanables[i].run(let[1][j]);
                }

            }

        }
    }

    public static boolean stopConditions(){
        return  conditions = false;
    }
}
