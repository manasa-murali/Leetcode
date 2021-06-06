fun main() {
    println(maxProfit2(intArrayOf(7, 1, 5, 3, 6, 4)))
}

fun maxProfit2(prices: IntArray): Int {
    var maxprofit = 0
    var minprice = Int.MAX_VALUE
    var index = 0
    for (i in prices.indices) {
        if (prices[i] < minprice) {
            minprice = prices[i]
        } else {
            maxprofit += prices[i] - minprice
            minprice = Int.MAX_VALUE
        }

    }
    return maxprofit
}
