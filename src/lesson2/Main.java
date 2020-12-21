package lesson2;

public class Main {
    private static int i;
    private static int j;

    public static void main(String[] args) {
        String[][] strArrayRight = { {"1", "3", "5", "7"},
                {"11", "13", "15", "17"},
                {"21", "23", "25", "27"},
                {"31", "33", "35", "37"}
        };
        String[][] strArrayWrongElements = { {"1", "3", "5", "7"},
                {"1", "3", "5"},
                {"1", "3", "5", "7"},
                {"1", "3", "5", "7"}
        };
        String[][] strArrayNonNumber = { {"1", "3", "5", "7"},
                {"1", "3", "5", "7"},
                {"1", "three", "5", "7"},
                {"1", "3", "five", "7"}
        };



        try {
//            myArraySizeException(strArrayRight);
//            myArrayDataException(strArrayRight);

//            myArraySizeException(strArrayWrongElements);
//            myArrayDataException(strArrayWrongElements);
//
            myArraySizeException(strArrayNonNumber);
            myArrayDataException(strArrayNonNumber);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Неверное количество элементов в массиве");
        }
        catch (NumberFormatException e) {
            System.out.println(strArrayNonNumber[i][j] + " не число");
        }
    }

    private static void myArraySizeException (String[][] strArray) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               String str = strArray[i][j];
            }
        }
        System.out.println("Массив 4x4.");
    }

    private static void myArrayDataException (String[][] strArray) throws NumberFormatException {
        int sum = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                sum += Integer.parseInt(strArray [i][j]);
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
