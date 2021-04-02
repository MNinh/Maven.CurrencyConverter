package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    CurrencyType uniCurrency;

    public UniversalCurrency(){
         uniCurrency = CurrencyType.UNIVERSAL_CURRENCY;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / uniCurrency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
