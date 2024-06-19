public class Main {
    public static void main(String[] args) {
        //1.Вывести макс и мин
        int[] nums = {3, 9, -6, 7, 0, 4, -10};

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        //2.Вывести чет и не чет числа
        for (int number : nums) {
            if (number % 2 == 0) {
                System.out.println("Чётное число: " + number);
            }
        }
        for (int number : nums) {
            if (number % 2 != 0) {
                System.out.println("Нечётное число: " + number);
            }
        }

        //3.Самое короткое и самое длинное
        int[] numbers = {3, 55, 701, 2, 8923, -1, 44, 10005, 120};

        int longestNumber = numbers[0];
        int shortestNumber = numbers[0];

        int longestDigits = 0;
        int shortestDigits = Integer.MAX_VALUE;

        for (int number : numbers) {
            int absNumber = Math.abs(number);
            int digitCount = 0;
            int temp = absNumber;

            while (temp != 0) {
                temp /= 10;
                digitCount++;
            }

            if (digitCount > longestDigits) {
                longestDigits = digitCount;
                longestNumber = number;
            }
            if (digitCount < shortestDigits) {
                shortestDigits = digitCount;
                shortestNumber = number;
            }
        }
        System.out.println("Самое длинное число: " + longestNumber);
        System.out.println("Самое короткое число: " + shortestNumber);

        //5.Палиндром
        int [] array = {45, 234, 4884, 342, 33488433};
        for(int i:array){
            int original = i;
            int rev =0;
            while(i!=0){
                int digit = i%10;
                rev=rev*10 + digit;
                i/=10;
            }
            if(original == rev){
                System.out.println(original + " является палиндромом.");
            }
        }
    }
}