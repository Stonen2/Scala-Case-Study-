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
       
       
      
      
      
      
       
    
  }
}