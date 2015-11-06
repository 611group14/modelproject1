package com.example.administrator.map;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity
{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
       setUpMapIfNeeded();
    }

    protected void onResume()
    {
        super.onResume();
        setUpMapIfNeeded();
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
   private void setUpMapIfNeeded()
   {
       if(mMap==null)
       {
           mMap=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
           if(mMap!=null)
           {
               setUpMap();
           }
       }
   }

   private void setUpMap()
   {
       mMap.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Maker"));
   }




}
