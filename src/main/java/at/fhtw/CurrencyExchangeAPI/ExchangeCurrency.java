package at.fhtw.CurrencyExchangeAPI;

public class ExchangeCurrency {

    public double exchangeEuroToUSD(double euro){
        double exc =   euro *  1.09;
        return (double) Math.round(exc * 100) / 100;


    }

    public double exchangeEuroToGBP(double euro){
        double exc = euro * 0.88;
        return (double) Math.round(exc * 100) / 100;
    }

    public double exchangeEuroToJPY(double euro){
        double exc = euro * 140.60;
        return (double) Math.round(exc * 100) / 100;

    }

}
