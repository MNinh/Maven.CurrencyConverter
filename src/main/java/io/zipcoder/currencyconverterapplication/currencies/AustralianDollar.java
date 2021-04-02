package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    CurrencyType auDollar;

    public AustralianDollar(){
        auDollar = CurrencyType.AUSTRALIAN_DOLLAR;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / auDollar.getRate();
    }


    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
