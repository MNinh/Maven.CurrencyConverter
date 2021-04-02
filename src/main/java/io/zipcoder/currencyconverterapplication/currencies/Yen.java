package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    CurrencyType yen;

    public Yen(){
        yen = CurrencyType.YEN;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / yen.getRate();
    }


    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.YEN;
    }
}
