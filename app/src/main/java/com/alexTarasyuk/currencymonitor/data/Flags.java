package com.alexTarasyuk.currencymonitor.data;

import com.alexTarasyuk.currencymonitor.R;



public enum Flags {
    EUR(R.drawable.european_union),
    USD(R.drawable.united_states),
    JPY(R.drawable.japan),
    GBP(R.drawable.united_kingdom),
    CHF(R.drawable.switzerland),
    AUD(R.drawable.australia),
    CAD(R.drawable.canada),
    SEK(R.drawable.sweden);

    private int value;

    private Flags(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
