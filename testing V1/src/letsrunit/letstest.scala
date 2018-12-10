package letsrunit

object letstest {
 
  def factorial(x : Int) :  Int = { 
    if(x == 1){
      return 1; 
      
    }
    return x * factorial(x-1);
    
    
  }
  def Sum(a: Int, b: Int) :  Int = { 
   
    a + b; 
    
  }
    
    def Sum1(a:Int, b:Int) :Int = {a + b}
    
    
      def product1(a: Int, b: Int) :  Int = { 
   
      a - b; 
  }
    
    def product(a:Int,b:Int) :Int = {a-b}
  
  
   // def prod(theoretical:Int,Actual:Int) : Int={
    ///  var t = error(Theoretical,Actual);
      
      
    //}
    
    def abs(a:Double):Double =  {
      var b = a; 
      if(a < 0){
        b = a * -1;  
      }
      b;
    }
   
 def error(theoretical:Double,Actual:Double):Double = {
      var temp = 0.0;
      var theo = theoretical; 
      var act = Actual; 
      temp = theo - act; 
      temp =  abs(temp); 
      
      var temp1 = temp / theo; 
      
       var temp2 = temp1 * 100;
       temp2; 
      
   }
    
    
  def main(args: Array[String]): Unit = {
 
    var d = product(30,20);
    println(d);  
    var h = product1(10,20);
    println(h);
    var g = abs(-10);
    println(g);
    var p = error(110,100); 
    println(p); 
    val name = "Daniel":String;
    
    
    
  }
}





    
////    1 + 2+ 3; 
//     var q = factorial(4); 
 //   println(q);
 //   var t = Sum1(45,45); 
  //  println(t); 
//  println("Hello World"); 
//  
//  println("Why is this block of code not working? ");
// //   ArrayList<String> l = new ArrayList<String>(); 
//    
//  
//  
//    var list = List("1","2","3","4");
// 
//  
//    var array2 = (3,4,5,7,89,899,43);
//     
//    var list2 = ("1","2","3");
//    
//    System.out.println("Hello World"); 
//    
//      var array1 = Array(1,2,3,56,4,34,23,5,6,43,23,4);
//    var i = 0;
//    var j = 0; 
//    var temp = array1(0);
//    
//    for(i <-0 to array1.length-1){
//      for(j <- 0 to i){
//        
//        if(array1(i) > array1(j)){
//          temp = array1(i);
//          array1(i) = array1(j); 
//          array1(j) = temp; 
//          println("Swap" + array1(i) + " With" + array1(j));
//        }
//       }
//        
//      }
//     // System.out.println(i);
//      
//    for (i <- 0 to array1.length-1){
//      println(array1(i));
//      
//    }
//    
//    
//    
//    }
//   
//    val x = 5; 
//    
// //  x = 6; 
//    
    
    
  
  
//}