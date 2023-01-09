class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer: MutableList<Int> = arrayListOf()
        for (i in nums.indices) {
            for (j in i+1 until nums.size) {
                if (nums[i]+nums[j]==target) {
                    answer.clear()
                    answer.addAll(arrayOf(i,j))
                }
            }
        }
        println(answer)
        return answer.toIntArray()
    }
}