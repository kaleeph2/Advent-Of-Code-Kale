 //Solution 1 for advent of code. 
 
 for (var = i; i <= 100; i++) {
    
       String output = "";
     
       if( i % 3 == 0) { output += "Fizz"; }
       if( i % 5 == 0) { output += "Buzz"; }
    
       if(output == "") { output = i; }
    
       System.out.println(output);

}


