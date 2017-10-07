class Solution {
    public static int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();   // kill add white spaces
        int i = 0;          // index of str
        char flag = '+';    // default positive
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        double res = 0;
        // abandon the non-digit char; calculate the result
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            res = res * 10 + str.charAt(i) - '0';
            i++;
        }
        if (flag == '-') res = -1 * res;
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }
}
// 按照函数说明来一步步处理。首先判断输入是否为null。然后使用trim()函数删掉空格。判断是否有正负号，做一个标记。返回的是整形数，可以使用double来暂存结果。按位来计算出结果。如果遇到非数字字符，则返回当前结果。加上前面的正负号。结果若超出了整形范围，则返回最大或最小值。最后返回处理结果。

