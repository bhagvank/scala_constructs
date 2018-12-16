

object StringIteratorTest {
 def main(args: Array[String]) {
   var strs = new Array[String](3)
   strs(0) = "tree";
   strs(1) = "map";
   strs(2) = "list";
     class Iter extends StringIterator(strs(0)) with RichIterator
     val iter = new Iter
     iter foreach println
   }
}
