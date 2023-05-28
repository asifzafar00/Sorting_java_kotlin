
fun main() {


     fun formattingString(s: String): String? {
        var re = ""
        for (i in 0 until s.length - 1) {
            if (Character.isLetter(s[i])) {
                re = re + s[i]
                if (Character.isDigit(s[i + 1])) {
                    re = "$re "
                }
            } else if (Character.isDigit(s[i])) {
                re = re + s[i]
                if (Character.isLetter(s[i + 1])) {
                    re = "$re "
                }
            }
        }
        return re + s.substring(s.length - 1)
    }

     fun normalForm(s: String): String? {
        var re = ""
        for (i in 0..s.length - 1) {
            if (!Character.isSpaceChar(s[i])) {
                re = re + s[i]
            }
        }
        return re
    }
}

