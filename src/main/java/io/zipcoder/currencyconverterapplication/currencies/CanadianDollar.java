package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    CurrencyType caDollar;

    public CanadianDollar(){
        caDollar = CurrencyType.CANADIAN_DOLLAR;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / caDollar.getRate();
    }


    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
