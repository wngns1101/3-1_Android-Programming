package com.inhatc.googlemap_source;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.inhatc.googlemap_source.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        double dLatitude = 37.448344;
        double dLongitude = 126.657474;
        LatLng objLocation;
        objLocation = new LatLng(dLatitude, dLongitude);
        Marker objMK1 = mMap.addMarker(new MarkerOptions().position(objLocation).title("Inha Technical College").snippet("INHATC"));

        dLatitude = 37.449402;
        dLongitude = 126.657348;
        objLocation = new LatLng(dLatitude, dLongitude);
        Marker objMK2 = mMap.addMarker(new MarkerOptions().position(objLocation).title("수준원점").snippet("국토 높이의 기준점"));

        objMK2.showInfoWindow();

        mMap.moveCamera(CameraUpdateFactory.newLatLng(objLocation));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(16));

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}