package algo.inter;


public class Test {

  public static void main(String[] a){

    int [] arr= { -2, -1, 3, 5, 7 };

    int len = arr.length;
    
    int sofarSmall = arr[0] + arr[1];

     int final1st =  arr[0];
     int final2nd = arr[1];
   
   for( int i= 0; i<len-1 ; i++){
     for(int j = i+1; j< len; j++){
       int sum = Math.abs(arr[i] + arr[j]);
         
       if(Math.abs(sofarSmall)  > Math.abs(sum) ){
         sofarSmall   = sum;
         final1st  = arr[i];
         final2nd = arr[j];  
        }
     
    }
 
  }   

  System.out.println(final1st + "  , " +  final2nd);
    

}
}
