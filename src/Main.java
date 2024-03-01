import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = generateRandomArray();
       System.out.println("Сгенерируй массив  "+ Arrays.toString(arr));
       task1(arr);
       task2(arr);
       task3(arr);
       task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(int[]arr){
        System.out.println("Задание 1");
        int sum = 0;
        for(int money : arr){
            sum=sum+money;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2(int[]arr) {
        System.out.println("Задание 2");
    }

    public static void task3(int[]arr) {
        System.out.println("Задание 3");

    }

    public static void task4() {
        System.out.println("Задание 4");

    }


}



