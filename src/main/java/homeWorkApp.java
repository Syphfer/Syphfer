public class homeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColour();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 5;
        int b = 10;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        {
            if (c < 0) {
                System.out.println("Сумма отрицательная");
            }

        }
    }

    public static void printColour() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int aa = 30;
        int bb = -20;
        if (aa >= bb) {
            System.out.println("aa>=bb");
        } else {
            System.out.println("bb<aa");
        }
    }
}