package com.alexTarasyuk.currencymonitor.di.modules;

/**

 */

import android.app.Activity;
import android.content.Context;

import com.alexTarasyuk.currencymonitor.interfaces.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @ApplicationScope
    @Provides
    public Context context(){ return context; }
}
