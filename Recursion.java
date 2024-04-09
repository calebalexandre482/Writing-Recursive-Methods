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

    /* Problem 2:
    Write a recursive method called print_n2 that given n, prints 0, 1, 2, 3, 4, ... n */
    public static void print_n2(int n) {
        if (n >= 0) {
            print_n2(n - 1);
            System.out.print(n + ", ");
        }
    }
    
    /* Problem 3:
    Write a recursive method called array_sum with two parameters, array a and index n, that returns the sum of all the elements in an array. 
    Precondition is that the length of the array is greater than zero. */
    public static int array_sum(int[] a, int n) {
        if(n == 0) {
            return a[0];
        }
        else {
            return a[n] + array_sum(a, n -1);
        }
    }

    /* Problem 4: 
    Write a recursive method called reverse with one parameter string and returns a string that is the reverse of the original. 
    For example, if the original string is "cow" then this method returns "woc" */
    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        else {
            return str.substring(str.length()-1,str.length()) + reverse(str.substring(0, str.length()-1));
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println("print_n: ");
        print_n(3);
        System.out.println("print_n2: ");
        print_n2(14);
        System.out.println("\narray_sum: " + array_sum(array, 3));
        System.out.println("reverse: " + reverse("cow"));

    }
}