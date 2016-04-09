

object Main {

  def time[A](f: => A) = {
    val s = System.nanoTime
    val ret = f
    println("time: "+(System.nanoTime-s)/1e6+"ms")
    ret
  }


  def main(args: Array[String]) {
    val start = System.nanoTime
    printf("Version %2d.%3d %s\n", 0, 1, "You know, for starters.")

    time(System.nanoTime - start)
  }
}