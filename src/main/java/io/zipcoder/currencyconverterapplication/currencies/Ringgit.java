package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    CurrencyType ranggit;

    public Ringgit(){
        ranggit = CurrencyType.RINGGIT;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / ranggit.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RINGGIT;
    }
}
