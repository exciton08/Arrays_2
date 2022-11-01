import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void ex1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray(); // инициализация массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.println(new DecimalFormat( "###,###.##" ).format(arr[i]));
                break;
            }
            System.out.print(new DecimalFormat( "###,###.##" ).format(arr[i]) + ",  ");
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + new DecimalFormat( "###,###.##" ).format(sum)+ " рублей.");
    }


    public static void ex2() {
        System.out.println();
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            else if (max < arr[i]) {
                max = arr[i];
            }
            if (i == arr.length -1) {
                System.out.println(new DecimalFormat( "###,###.##" ).format(arr[i]));
                break;
            }
            System.out.print(new DecimalFormat( "###,###.##" ).format(arr[i]) + ",  ");
        }
        System.out.println("Минимальная сумма трат за день составила " + new DecimalFormat( "###,###.##" ).format(min) + " рублей. Максимальная сумма трат за день составила " + new DecimalFormat( "###,###.##" ).format(max) + " рублей.");
    }

    public static void ex3() {
        System.out.println();
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        double averageValue;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.println(new DecimalFormat( "###,###.##" ).format(arr[i]));
                break;
            }
            sum += arr[i];
            System.out.print(new DecimalFormat("###,###.##").format(arr[i]) + ",  ");
        }
        System.out.println("Сумма трат за месяц составила " + new DecimalFormat("###,###.##").format(sum) + " рублей.");
        averageValue = sum / (double) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + new DecimalFormat("###,###.##").format(averageValue) + " рублей.");
    }

    public static void ex4() {
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

