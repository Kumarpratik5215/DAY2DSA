class Day2 {
  def findPosssibleCombinations(arr: Set[Int],n: Int): List[Set[Int]] = {
    def findPossibleCombinationsHelper(arr: Set[Int],n: Int,currentCombination: Set[Int]): List[Set[Int]] = {
      if (n == 0) {
        List(currentCombination)
      }
      else if (n < 0 || arr.isEmpty) {
        List.empty
      }
      else {
        findPossibleCombinationsHelper(arr.tail,n,currentCombination) ++
          findPossibleCombinationsHelper(arr.tail,n - arr.head,currentCombination + arr.head)
      }
    }

    findPossibleCombinationsHelper(arr,n,Set.empty)
  }
}

  object Day2 {
    def main(args: Array[String]): Unit = {
      val day2 = new Day2()
      val arr = Set(1, 2, 3, 4, 5)
      val n = 8
      println(day2.findPosssibleCombinations(arr,n))

    }
  }


