package com.sebastijanzindl.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {
    @Test
    void bestTimeToBuySellStock() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        int result = BestTimeToBuySellStock.maxProfit(prices);

        assertEquals(5, result);
    }

}