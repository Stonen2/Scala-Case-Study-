object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))

  // A definition of factorial, using a local, tail recursive function
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

  }
  
  object functional{
     def absoluteValue(int x){
       if(x < 0){
         return x * -1;
       }
       else{
         return x; 
         
         
       }
       def facrotial(int x){
         if(x == 1){
           
           return 1;
         }
         else{
           
           return x * factorial(x-1);
         }
         
       }
       
     }
    
  }
  
    def main(args: Array[String]): Unit =