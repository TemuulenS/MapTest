package test.example.com.maptest.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by Temuulen on 10/4/2016.
 */

public class MyItem implements ClusterItem {
    private final LatLng mPosition;
    private String mName;

    public MyItem(double lat, double lng, String name) {
        mPosition = new LatLng(lat, lng);
        mName = name;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    public String getmName() {
        return mName;
    }
}
