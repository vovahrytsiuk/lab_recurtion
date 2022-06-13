package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def factorial(i: Int): Int = {
      if (i == 0) 1 else i * factorial(i - 1)
    }
    factorial(r) / factorial(c) / factorial(r - c)
  }


  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    //    closed diff - difference between closed and opened parenthesis
    def isBalanced(chars: List[Char], closedDiff: Int): Boolean = {
      if (closedDiff > 0) false
      else if (chars.isEmpty && closedDiff == 0) true
      else if (chars.head == '(') isBalanced(chars.tail, closedDiff - 1)
      else if (chars.head == ')') isBalanced(chars.tail, closedDiff + 1)
      else isBalanced(chars.tail, closedDiff)
    }
    isBalanced(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1
    else if(money > 0 && coins.nonEmpty) countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else 0
  }


  /**
   * Exercise 4
   */
  def individual(k: BigInt = 9, i: BigInt = 1, n: BigInt = 4)(x: BigInt):BigInt = {
    if(x == n) -1
    else if (x < n) 0
    else if (i <= k) x ^ k * individual(k, i + 1, n)(x)
    else 1
  }
}
