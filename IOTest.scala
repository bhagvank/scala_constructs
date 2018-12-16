

import java.io._

object IOTest {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("c:\\temp\\test.txt" ))

      writer.write("Hello Scala")
      writer.close()
   }
}