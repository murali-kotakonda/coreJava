package algo;


public class SecondLargest2 { 
	
	 /* Function to print the second largest
    elements */
    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;
 
        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
 
        first = second = Integer.MIN_VALUE;
        for (int num: arr) {
            /* If current element is smaller than 
            first then update both first and second */
            if (num> first) {
                second = first;
                first = num;
            }
 
            /* If arr[i] is in between first and 
               second then update second  */
            else if (num > second && num != first)
                second = num;
        }
 
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                             + " element\n");
        else
            System.out.print("The second largest element"
                             + " is " + second);
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
