package scripts

/**
 * @Author Rishijeet Mishra on 04/05/24. 
 * */
import scala.io.StdIn.readLine

object Interactive {

  def main(args: Array[String]) = {
    println("Please enter your name:")
    val name = readLine()

    println("Hello, " + name + "!")
  }

}
