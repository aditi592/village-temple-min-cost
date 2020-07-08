package com.java.village;


import java.util.*; 

public class Village {

	
	   private static long minimumTempleCost(long pricePerPerson[], int numberOfPersons) 
	    { 
	      
		   	//to sort the given array
	        Arrays.sort(pricePerPerson); 
	          
	        long totalCost = 0; 

		    
	      //if numberOfPersons is greater than 2
	        for (int i = numberOfPersons - 1; i > 1; i -= 2) 
	        { 
	        	// if numberOfPersons is 3
	            if (i == 2) 
	            { 
	                totalCost += pricePerPerson[2] + pricePerPerson[0]; 
	            } 
	            
	           // if numberOfPersons is 4 or finding minimum of 2 approach
	            else if(2*pricePerPerson[i-2]>pricePerPerson[2]+2*pricePerPerson[0])
	            { 
	            	totalCost=  pricePerPerson[i] + pricePerPerson[i - 1] + 2 * pricePerPerson[0]; 
	      
	            }
	            else
	            {
	           	 totalCost= pricePerPerson[i] + pricePerPerson[0] + 2 * pricePerPerson[1]; 
	               
	            } 
	        } 
	        
	        	// if numberOfPersons is 1
	        if ( numberOfPersons== 1) 
	        { 
	            totalCost += pricePerPerson[0]; 
	        } 
	        	
	        	//execute in all cases when numberOfPersons is greater than 2

	        else
	        { 
	            totalCost += pricePerPerson[1]; 
	        } 
	      
	       
	        return totalCost; 
	    } 
	      
	   
	    public static void main (String[] args) 
	    { 
	    	
	    	//test case 1
	    	System.out.println("#####Testing test case 1 #######");
	        long pricePerPerson[] = { 300,400,600,700}; 
	        int numberOfPersons  = pricePerPerson.length; 
	        
	        
	        System.out.println("Price Per Persons : "+Arrays.toString(pricePerPerson));
	        System.out.println("Total Persons : "+numberOfPersons);
	        System.out.println("#####Result test case 1 #######");
	      
	        System.out.println(minimumTempleCost(pricePerPerson, numberOfPersons)); 
	        

	    	//test case 2
	    	System.out.println("#####Testing test case 2 #######");
	        long pricePerPerson1[] = { 1321,2450}; 
	        int numberOfPersons1  = pricePerPerson1.length; 
	        
	        
	        System.out.println("Price Per Persons : "+Arrays.toString(pricePerPerson1));
	        System.out.println("Total Persons : "+numberOfPersons1);
	        System.out.println("#####Result test case 2 #######");
	      
	        System.out.println(minimumTempleCost(pricePerPerson1, numberOfPersons1)); 
	        

	    	//test case 3
	    	System.out.println("#####Testing test case 3 #######");
	        long pricePerPerson2[] = { 500,123,873}; 
	        int numberOfPersons2  = pricePerPerson2.length; 
	        
	        
	        System.out.println("Price Per Persons : "+Arrays.toString(pricePerPerson2));
	        System.out.println("Total Persons : "+numberOfPersons2);
	        System.out.println("#####Result test case 3 #######");
	      
	        System.out.println(minimumTempleCost(pricePerPerson2, numberOfPersons2)); 
	        
    	//test case 4
    	System.out.println("#####Testing test case 4 #######");
        long pricePerPerson3[] = { 600,800,150,700}; 
        int numberOfPersons3  = pricePerPerson3.length; 
        
        
        System.out.println("Price Per Persons : "+Arrays.toString(pricePerPerson3));
        System.out.println("Total Persons : "+numberOfPersons3);
        System.out.println("#####Result test case 4 #######");
      
        System.out.println(minimumTempleCost(pricePerPerson3, numberOfPersons3)); 
	} 
}
