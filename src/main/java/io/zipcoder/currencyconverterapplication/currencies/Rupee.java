package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType rupee;

    public Rupee(){
         rupee = CurrencyType.RUPEE;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / rupee.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RUPEE;
    }
}
