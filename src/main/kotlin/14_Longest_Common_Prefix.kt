class `14_Longest_Common_Prefix` {
    fun longestCommonPrefix(strs : Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length-1)
            }
        return prefix
    }
}