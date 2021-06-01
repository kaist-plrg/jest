package kr.ac.kaist.jest.ir

object Helper {
  def print(st: State, value: Value): Unit = value match {
    case addr: Addr =>
      println(addr)
      println(beautify(st.heap(addr)))
    case _ => {
      println(beautify(value))
    }
  }

  def getRadixString(d: Long): String = {
    if (d < 10) d.toString else ('a' + (d - 10)).toChar.toString
  }

  def toStringHelper(m: Double, radix: Int): String = {
    // 5. Otherwise, let n, k, and s be integers such that k >= 1,
    //    10^(k-1) <= s < 10^k, the Number value for s * 10^(n-k) is m,
    //    and k is as small as possible.
    //    Note that k is the number of digits in the decimal representation of s,
    //    that s is not divisible by 10, and that the least significant digit of s
    //    is not necessarily uniquely determined by these criteria.
    var s = BigDecimal(m)
    var n = 0
    while (s % radix == BigDecimal(0) || s % 1 != BigDecimal(0)) {
      if (s % radix == BigDecimal(0)) {
        s /= radix
        n += 1
      } else {
        s *= radix
        n -= 1
      }
    }
    while ((((s - (s % radix)) / radix) * BigDecimal(radix).pow(n + 1)).toDouble == m) {
      s = (s - (s % radix)) / radix
      n = n + 1
    }

    var sLong = s.toLong
    var k = 0
    while (s >= BigDecimal(1)) {
      s /= radix
      k += 1
    }
    n += k
    def getStr(number: Long): String = {
      var str = ""
      var sLong = number
      while (sLong > 0) {
        str += getRadixString(sLong % radix)
        sLong /= radix
      }
      str.reverse
    }
    def getSign(n: Int): Char = {
      if (n - 1 > 0) '+'
      else '-'
    }
    if (k <= n && n <= 21) {
      // 6. If k <= n <= 21, return the String consisting of the k digits of the decimal representation of s
      //    (in order, with no leading zeroes), followed by n-k occurrences of the character '0'.
      getStr(sLong) + ("0" * (n - k))
    } else if (0 < n && n <= 21) {
      // 7. If 0 < n <= 21, return the String consisting of the most significant n digits of
      //    the decimal representation of s, followed by a decimal point '.',
      //    followed by the remaining k-n digits of the decimal representation of s.
      val str = getStr(sLong)
      str.substring(0, n) + '.' + str.substring(n)
    } else if (-6 < n && n <= 0) {
      // 8. If -6 < n <= 0, return the String consisting of the character '0', followed by a decimal point '.',
      //    followed by -n occurrences of the character '0', followed by the k digits of the decimal representation of s.
      "0." + ("0" * (-n)) + getStr(sLong)
    } else if (k == 1) {
      // 9. Otherwise, if k = 1, return the String consisting of the single digit of s,
      //    followed by lowercase character 'e', followed by a plus sign '+' or minus sign '-'
      //    according to whether n-1 is positive or negative, followed by the decimal representation of
      //    the integer abs(n-1) (with no leading zeroes).
      getStr(sLong) + "e" + getSign(n) + math.abs(n - 1).toString
    } else {
      // 10. Return the String consisting of the most significant digit of the decimal representation of s,
      //     followed by a decimal point '.', followed by the remaining k-1 digits of the decimal representation of s,
      //     followed by the lowercase character 'e', followed by a plus sign '+' or minus sign '-' according to
      //     whether n-1 is positive or negative, followed by the decimal representation of the integer abs(n-1) (with no leading zeroes).
      val str = getStr(sLong)
      str.substring(0, 1) + '.' + str.substring(1) + 'e' + getSign(n) + math.abs(n - 1).toString
    }
  }

  // normalize strings
  def norm(str: String): String =
    str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n")
}
