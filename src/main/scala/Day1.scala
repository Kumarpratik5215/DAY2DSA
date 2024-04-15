object NthPrime {

  def isPrime(number: Int,divisor: Int = 2): Boolean = {
    if (number <= 1) {
      false
    }
    else if (divisor * divisor > number){
      true
    }
    else if (number % divisor == 0) {
      false
    }
    else isPrime(number, divisor + 1)
  }

  def nthPrimeNumber(n: Int,current: Int = 2,count: Int = 0): Int = {
    if (count == n){
      current - 1
    }
    else if (isPrime(current)) {
      nthPrimeNumber(n,current + 1,count + 1)
    }
    else nthPrimeNumber(n,current + 1,count)
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    val result = nthPrimeNumber(n)
    println(s"$n-th prime number is: $result")
  }
}