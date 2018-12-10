package letsrunit

 class lets(var c: Int, var y: Int) {
   var x: Int = c
   var v: Int = y
   var k: Int = 0; 
   
   def math(){
     k = x + v;
     print(k); 
   }
}


object letst {
 
  def factorial(x : Int) :  Int = { 
    if(x == 1){
      return 1; 
      
    }
    return x * factorial(x-1);
    
    
  }
    
    def product(a:Int,b:Int) :Int = {a-b}
  
    
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
    var g = abs(-10);
    println(g);
    var p = error(110,100); 
    println(p); 
    val name = "Daniel":String;
    var a,r,t,y,b = null:String;
    
    var list = Array(a,r,t,y,b);

     var list2 =(a,r,t,y,b);
      
    println(list(0)); 
    println(list2); 
    
    var testingobjects = new lets(10,10); 
    var testingobjects2 = new lets(10,10); 
    
    var list3 =Array(testingobjects); 
    println(list3);
    
    val list4 = List(testingobjects,testingobjects2);
    
    print(list4(1).math);
    print(list4(0).math);
    
  
    
    
    
    
  }
}




