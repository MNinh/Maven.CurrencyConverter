package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    CurrencyType singDollar;

    public SingaporeDollar(){
        singDollar = CurrencyType.SINGAPORE_DOLLAR;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / singDollar.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
