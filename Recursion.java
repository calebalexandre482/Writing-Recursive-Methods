public class Recursion {

    /* Problem 1:
    Write a recursive method called print_n that, given n, prints n, n-1, ... 2, 1,0 */
    public static void print_n(int n) {
        if (n > 0) {
            System.out.print(n + ", ");
            print_n(n-1);
        }
        else {
            System.out.println(0);
        }
    }

    /*Problem 2:
    Write a recursive method called print_n2 that given n, prints 0, 1, 2, 3, 4, ... n */
    public static void print_n2(int n) {
        
    }
    
    /* Problem 3:
    Write a recursive method called array_sum with two parameters, array a and index n, that returns the sum of all the elements in an array. 
    Precondition is that the length of the array is greater than zero. */
    

    public static void main(String[] args) {
        print_n(3);
    }
}