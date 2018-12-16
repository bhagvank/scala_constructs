

import scala.io.Source

object ReadIo {
   def main(args: Array[String]) {
      println("Following is the content read:" )

      Source.fromFile("C:\\temp\\test.txt" ).foreach{ 
         print 
      }
   }
}