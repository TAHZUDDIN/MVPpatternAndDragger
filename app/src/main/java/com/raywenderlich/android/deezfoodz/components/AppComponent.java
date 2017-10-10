package com.raywenderlich.android.deezfoodz.components;

import com.raywenderlich.android.deezfoodz.modules.AppModule;
import com.raywenderlich.android.deezfoodz.modules.NetworkModule;
import com.raywenderlich.android.deezfoodz.modules.PresenterModule;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tahzuddin on 10/10/17.
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(FoodzActivity target);
    void inject(FoodzPresenterImpl target);
    void inject(FoodPresenterImpl target);
}
