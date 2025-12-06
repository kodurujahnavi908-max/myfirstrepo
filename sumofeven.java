public class sumofeven{

    public static void main(String[] args) {
        
        int sum = 0;

        int number = 2; 
        for (int i = 1; i <= 10; i++) {
            sum += number; 
            number += 2; 
        }

        System.out.println("The sum of the first 10 even numbers is: " + sum);
    }
}

