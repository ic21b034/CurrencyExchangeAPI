package at.fhtw.CurrencyExchangeAPI.Controller;

import at.fhtw.CurrencyExchangeAPI.ExchangeCurrency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    ExchangeCurrency exc = new ExchangeCurrency();

    @GetMapping("/")
    String hello() {
        return"Hello";
    }

   @GetMapping("EuroToUSD/{euro}")
   double usd(@PathVariable double euro) {
       return exc.exchangeEuroToUSD(euro);
   }

    @GetMapping("EuroToGBP/{euro}")
    Double gpb(@PathVariable double euro) {
        return exc.exchangeEuroToGBP(euro);
    }

    @GetMapping("EuroToJPY/{euro}")
    double jpy(@PathVariable double euro) {
        return exc.exchangeEuroToJPY(euro);
    }
}
