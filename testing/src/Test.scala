//Case study for Scala CSCI 300 
//Written By Nick Stone
//Written on 11/12/2018
// Discoveries. Val appears to work as a static variable. No changing the variable
//THe for loops and other loops are not intuitive like Java. Intriguing. 

object HelloWorld {
  
  
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    
//    for(int i = 0; i < 10; i++){
//      
//      println(i);
//    }
   val n = 0; 
    var i = 10; 
    println(i)
    println(n) 
    
    
    for(j <- 1 to 10){
      val i = 10
    //  i = i + 10
      println(i + 5)
      
      
    }
     
    
    
    //Invoke Until 
       var g = 1
       for(b <- 1 until 10){
   
      g = g + 6
      println(g)
      
      
    }
   
       
       //Lets play with Lists 
       
    var list = List("1","2","3","4");
    var a = 0
    
    for(a <- list){
      
      println(a);
    }
    
    
       a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

      // Now print returned values using another loop.
      for( a <- retVal){
         println( "Value of a: " + a );
      }
       
       
      
      var h = 0;
      for(kkk <- numList){
         
        h = kkk;
        
        for(jjjj <- numList){
          //  println(jjjj);
          //  println(numList(jjjj-1));
            
            
          
        }
        
        //  println(kkk);
        
        
      }
      
//Selection Sort 
// -------------------------------------------------------------------------------------------------------------      
      var Array2 = Array(54,6,734,48);
      
       for(g<- 0 to Array2.length-1){
        
        println(Array2(g));
        
      }
      
      
     
      var temp = 0; 
      
      for(i <- 0 to Array2.length-1){
        
        for( j <- 0 to i){
          
          if(Array2(i) < Array2(j)){
            println("Swap");
            println("-------------------------------------------");
            temp = Array2(i);
            
            Array2(i) = Array2(j);
           
            Array2(j) = temp; 
            for(g<- 0 to Array2.length-1){
                
                println(Array2(g));
        
            }
            println("-------------------------------------------");
          }
          
        }
        
        
        
      }
      
      println("-------------------------------------------------");
      for(g<- 0 to Array2.length-1){
        
        println(Array2(g));
        
      }
//End
//-----------------------------------------------------------------------------------------------------------
//Linear Search 
      
      var targ = 54;
      var found = false; 
      
      for(lk<- 0 to Array2.length-1){
        
        if(targ == Array2(lk)){
          found = true; 
          
          
        }
        
        
        
      }
      
      println(found); 
      
       
    
      
      
      
  }
}