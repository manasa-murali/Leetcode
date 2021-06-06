fun main() {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
}

fun maxProfit(prices: IntArray): Int {
    var maxprofit = 0
    var minprice = Int.MAX_VALUE
    var index = 0
    for (i in prices.indices) {
        if (prices[i] < minprice) {
            minprice = prices[i]
        } else if (prices[i] - minprice > maxprofit) {
            maxprofit = prices[i] - minprice
            index = i
        }

    }
    return maxprofit
}
