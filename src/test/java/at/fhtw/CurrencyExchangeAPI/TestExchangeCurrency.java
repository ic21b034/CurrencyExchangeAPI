package at.fhtw.CurrencyExchangeAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestExchangeCurrency {
        ExchangeCurrency exc = new ExchangeCurrency();
        @Test
        void trueCaseGBP(){
            assertEquals(2.64, exc.exchangeEuroToGBP(3));
        }
        @Test
        void falseCaseGBP(){
            assertNotEquals(2.5, exc.exchangeEuroToGBP(3));
        }


        @Test
        void trueCaseUSD(){
            assertEquals(3.27, exc.exchangeEuroToUSD(3));
        }
        @Test
        void falseCaseUSD(){
            assertNotEquals(3.90, exc.exchangeEuroToUSD(3));
        }

        @Test
        void trueCaseJPY(){
            assertEquals(421.80, exc.exchangeEuroToJPY(3));
        }
        @Test
        void falseCaseJPY(){
            assertNotEquals(500, exc.exchangeEuroToJPY(3));
        }
    }
