package com.alexTarasyuk.currencymonitor.di.modules;


import android.content.Context;

import com.alexTarasyuk.currencymonitor.interfaces.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Named("application_context")
    @ApplicationScope
    @Provides
    public Context context(){ return context.getApplicationContext(); }
}