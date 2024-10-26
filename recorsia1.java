package lotem1;


public class recorsia1 {
	public int summ(int n) {
		if(n == 1)
		{
		return 1;
		}
		return n + summ(n - 1);
	}
	
	public int factorial(int num){
		if (num == 1 || num == 0){
		return 1;
		
	}
		 return num * factorial(num - 1);
}
	    public int oddProduct(int n) {
	        // מקרה בסיס: אם n קטן או שווה ל-0, מחזירים 1 (מכיוון שאין מספרים אי-זוגיים)
	        if (n <= 0) {
	            return 1; 
	        }

	        // אם n אי-זוגי, מחזירים את n * הפונקציה עצמה עם n-1
	        if (n % 2 != 0) {
	            return n * oddProduct(n - 1);
	        } else {
	            // אם n זוגי, פשוט קוראים לפונקציה עם n-1
	            return oddProduct(n - 1);
	        }
	    }
	    public int Digits(int num) {
	    	if(num>= 0) {
	    	String	l= String.valueOf(num);
	    		return l.length();

	    	}
	    	return Digits(num-1);
	    }
	     public int ArithmeticOperations(int n, int n1) {
	    	 return 1;
	     }
	     public boolean Brec(int x, int y) {
	    	 if( y == 0)
	    	 return true;
	    	 else {
	    		 return false;
	    	 }
	     }
	     public int sumEven(int n) {
	    	    if (n <= 1) {  // מקרה בסיס
	    	        return 0;
	    	    }
	    	    if (n % 2 == 0) {  // אם המספר זוגי, נוסיף אותו לסכום
	    	        return n + sumEven(n - 1);
	    	    } else {  // אם המספר אי זוגי, נעבור למספר הבא
	    	        return sumEven(n - 1);
	    	    }
	    	}

	     // תרגיל 6: סכום הספרות של מספר
	     public int sumDigits(int n) {
	         if (n == 0) { 
	             return 0; // מקרה בסיס
	         }
	         return n % 10 + sumDigits(n / 10); // מוסיפים את הספרה האחרונה
	     }

	     // תרגיל 7: האם מספר אחד מתחלק בשני ללא שארית
	     public boolean isDivisible(int a, int b) {
	         if (b == 0) { // מניעת חלוקה באפס
	             return false;
	         }
	         return a % b == 0; // בדיקה אם יש שארית
	     }

	     // תרגיל 8: בדיקת ראשוניות של מספר
	     public boolean isPrime(int n, int i) {
	         if (n <= 2) {
	             return n == 2; // 2 הוא מספר ראשוני
	         }
	         if (n % i == 0) {
	             return false; // אם יש מחלק, המספר לא ראשוני
	         }
	         if (i * i > n) {
	             return true; // המספר ראשוני אם לא נמצא מחלק עד השורש שלו
	         }
	         return isPrime(n, i + 1); // בדיקה עם המחלק הבא
	     }

	     // עטיפה לפונקציה isPrime כדי להתחיל מ-2
	     public boolean isPrime(int n) {
	         return isPrime(n, 2);
	     }

	     // תרגיל 9: האם כל הספרות של מספר זוגיות
	     public boolean allEvenDigits(int n) {
	         if (n == 0) {
	             return true; // מקרה בסיס
	         }
	         if ((n % 10) % 2 != 0) {
	             return false; // אם הספרה אי-זוגית, מחזירים false
	         }
	         return allEvenDigits(n / 10); // ממשיכים לבדוק את שאר הספרות
	     }
	     
	}


	 



