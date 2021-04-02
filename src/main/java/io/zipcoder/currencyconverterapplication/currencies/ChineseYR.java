package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType chineseYR;

    public ChineseYR(){
        chineseYR = CurrencyType.CHINESE_YR;

    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / chineseYR.getRate();
    }
    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CHINESE_YR;
    }
}
