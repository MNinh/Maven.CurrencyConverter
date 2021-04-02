package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    CurrencyType franc;

    public Franc(){
        franc = CurrencyType.FRANC;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / franc.getRate();
    }
    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.FRANC;
    }
}
