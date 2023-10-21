package java_assignments;
import java.util.HashMap;
import java.util.Scanner;
 class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
    
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

    public static int romanToInteger(String s) {
         String pattern = "^(M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3}))$";
    
    if (!s.matches(pattern)) {
        System.out.println("Invalid Roman numeral input.");
        return -1; 
    }

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
   

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}

