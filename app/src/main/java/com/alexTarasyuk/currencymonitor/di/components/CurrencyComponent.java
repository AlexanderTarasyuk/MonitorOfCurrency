package com.alexTarasyuk.currencymonitor.di.components;

/**
 */

import com.alexTarasyuk.currencymonitor.di.modules.CurrencyModule;
import com.alexTarasyuk.currencymonitor.interfaces.ApplicationScope;
import dagger.Component;
import com.alexTarasyuk.currencymonitor.interfaces.FixerAPI;

@ApplicationScope
@Component(modules = {CurrencyModule.class})
public interface CurrencyComponent {

    FixerAPI getCurrencyService();
}
