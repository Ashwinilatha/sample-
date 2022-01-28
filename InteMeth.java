public class InteMeth {  
    public static void main(String[] args) {      
        Integer A =20;           
        Integer B =20;  
        Integer C =-10;  
		
		//Equals
		System.out.println(B);
        System.out.println("A is equal to B? " + A.equals(B));  
        System.out.println("B is equal to C? " + B.equals(C));  
        System.out.println("A is equal to C? " + A.equals(C));  
        System.out.println("C is equal to A? " + C.equals(A));  
        System.out.println("B is equal to A? " + B.equals(A));     
        //reverse      
          
        System.out.println("Number = " + A);                      
        System.out.println("Binary Representation = " + Integer.toBinaryString(A));           
        System.out.println("After reversing = " + Integer.reverse(A));  
        System.out.println("\nNumber = " + B);               
        System.out.println("Binary Representation = " + Integer.toBinaryString(B));           
        System.out.println("After reversing = " + Integer.reverse(B)); 

        //IntegerRotateLeftExample
	    System.out.println(Integer.rotateLeft(10,2));  		
     
	    //IntegerSumExample  
        // It will return the sum of a and b.  
        System.out.println("The sum of A and B is = " + Integer.sum(A, B)); 
		
		//comare method
        // as A SAME AS   B, Output will be  zero  
        System.out.println(Integer.compare(A, B));  
		// as A GREATER THAN C, Output will be 1 
        System.out.println(Integer.compare(A, C));  
        // as C LESS than B, Output will be LESS than -1 
        System.out.println(Integer.compare(C, B));            
     
        // compares two Integer values numerically  
        int retResult =  A.compareTo(B);        
          if(retResult > 0) {  
             System.out.println("A is greater than B");  
          } else if(retResult< 0) {  
             System.out.println("A is less than B");  
          } else {  
             System.out.println("A is equal to B");  
          }   
           
            
    }  
}