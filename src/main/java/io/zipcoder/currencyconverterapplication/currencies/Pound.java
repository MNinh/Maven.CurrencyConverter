package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    CurrencyType pound;

    public Pound(){
        pound = CurrencyType.POUND;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / pound.getRate();
    }
    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.POUND;
    }
}
