class `13_Roman_To_Integer` {
    fun romanToInt(s: String): Int {

        val map: Map<Char, Int> = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0
        var previous = 0
        for (i in s.length - 1 downTo 0) {
            val current = map[s[i]]
            if (current!! >= previous) result += current else result -= current
            previous = current
        }
        return result
    }
}