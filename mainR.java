package lotem1;

public class mainR {

    public static void main(String[] args) {
        int n = 1234;

        // יצירת אובייקט מהמחלקה recorsia1
        recorsia1 re = new recorsia1();

        // קריאה לפונקציה summ
        int result = re.summ(n);
        System.out.println("Sum from 1 to " + n + ": " + result);

        // קריאה לפונקציה factorial
        int result1 = re.factorial(n);
        System.out.println("Factorial of " + n + ": " + result1);

        // קריאה לפונקציה oddProduct
        int result2 = re.oddProduct(n);
        System.out.println("Product of odd numbers up to " + n + ": " + result2);

        // קריאה לפונקציה Digits
        int result3 = re.Digits(n);
        System.out.println("Number of digits in " + n + ": " + result3);

        // בדיקה לתרגיל 5: סכום המספרים הזוגיים
        int g = 10;
        System.out.println("Sum of even numbers up to " + g + ": " + re.sumEven(g));

        // בדיקה לתרגיל 6: סכום הספרות של מספר
        int num = 345;
        System.out.println("Sum of digits of " + num + ": " + re.sumDigits(num));

        // בדיקה לתרגיל 7: האם מספר מתחלק באחר ללא שארית
        int a = 20, b = 5;
        System.out.println(a + " is divisible by " + b + ": " + re.isDivisible(a, b));

        // בדיקה לתרגיל 8: בדיקת ראשוניות של מספר
        int primeCandidate = 13;
        System.out.println(primeCandidate + " is prime: " + re.isPrime(primeCandidate));

        // בדיקה לתרגיל 9: האם כל הספרות זוגיות
        int evenDigitsNum = 2486;
        System.out.println("All digits of " + evenDigitsNum + " are even: " + re.allEvenDigits(evenDigitsNum));
    }
}
