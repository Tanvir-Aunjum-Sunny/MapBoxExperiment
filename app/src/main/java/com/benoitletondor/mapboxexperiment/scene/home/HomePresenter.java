package com.benoitletondor.mapboxexperiment.scene.home;

import android.support.annotation.NonNull;

import com.benoitletondor.mapboxexperiment.common.map.AutoCompleteLocationItem;
import com.benoitletondor.mapboxexperiment.common.map.MapMarker;
import com.benoitletondor.mapboxexperiment.common.mvp.presenter.BaseMapPresenter;

/**
 * Presenter for the {@link HomeView}
 *
 * @author Benoit LETONDOR
 */
public interface HomePresenter extends BaseMapPresenter<HomeView>
{
    /**
     * Called when the user search for a location using the geocoder search
     *
     * @param item the search item
     */
    void onLocationSearchEntered(@NonNull AutoCompleteLocationItem item);

    /**
     * Called when the user press on the add location FAB
     */
    void onAddLocationFABClicked();

    /**
     * Called when the back button is pressed by the user
     *
     * @return true to intercept it, false to let it go
     */
    boolean onBackPressed();

    /**
     * Called when the focus should be made on a marker
     *
     * @param marker marker to focus
     */
    void onMarkerToFocus(@NonNull MapMarker marker);
}
