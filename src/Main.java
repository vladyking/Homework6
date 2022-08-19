public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Задание №1:
        System.out.println("Ответ на задание №1: ");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей" + "\n");

        // Задание №2:
        System.out.println("Ответ на задание №2: ");
        System.out.println("Вывод элементов массива для проверки: ");
        int maxPrice = 100_000;
        int minPrice = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (maxPrice < arr[i]) {
                maxPrice = arr[i];
            }
            if (minPrice > arr[i]) {
                minPrice = arr[i];
            }
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма потраченная в день за месяц составила " + maxPrice + " рублей ");
        System.out.println("Минимальная сумма потраченная в день за месяц составила " + minPrice + " рублей" + "\n");

        // Задание №3:
        System.out.println("Ответ на задание №3: ");
        float Price = 0;
        for (int i = 0; i < arr.length; i++) {
            Price += arr[i];
        }
        System.out.println("Средняя сумма потраченная в день за месяц составила " + Price / arr.length + " рублей" + "\n");

        // Задание №4:
        System.out.println("Ответ на задание №4: ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
        }
        System.out.println(reverseFullName);

        /*/Вариант решения 4.1
        int lengthArr = reverseFullName.length;
        char temp;
        for (int i = 0; i < lengthArr / 2; i++) {
            temp = reverseFullName[lengthArr - i - 1];
            reverseFullName[lengthArr - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }*/

        //Вариант решения 4.2
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
