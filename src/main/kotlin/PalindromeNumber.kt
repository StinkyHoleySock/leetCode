class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        var firstPath: CharArray = charArrayOf()
        var secondPath: CharArray = charArrayOf()
        if (x>=0) {
            for (i in 0 until x.toString().length/2) {
                firstPath+=(x.toString()[i])
                secondPath+=(x.toString()[(x.toString().length-1)-i])
            }
        } else {
            println(false)
            return false
        }
        println(firstPath.contentEquals(secondPath))
        return firstPath.contentEquals(secondPath)
    }
}