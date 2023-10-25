package com.example.oli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLongitud, txtLatitud;//declara e inicializan las variables
    GoogleMap mMap; //Objeto GoogleMap que se utiliza para interactuar con el mapa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud=findViewById(R.id.txt_Latitud);
        txtLongitud=findViewById(R.id.txt_Longitud);
        //Se llama el fragmento mapa para asegurar que el mapa este listo para su uso
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);




        VideoView MiVideito = findViewById(R.id.videoView);

        String videito = "android.resource://"+getPackageName()+"/"+R.raw.videoejem;
        Uri uri= Uri.parse(videito);
        MiVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        MiVideito.setMediaController(mediaController);
        mediaController.setAnchorView(MiVideito);
    }

    @Override//Se llama cuando el mapa esta listo
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;//Se inicializa el objeto mMap con googleMao
        this.mMap.setOnMapClickListener(this);//Se configura el manejardor del evento de click
        this.mMap.setOnMapLongClickListener(this);
        //Se coloca un marcador en una ubicacion especifica y se mueve la camara para centrarla en esa ubicacion

        LatLng stm_Arica = new LatLng(-18.479512, -70.314535);
        mMap.addMarker(new MarkerOptions().position(stm_Arica).title("Santo Tomás Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Arica));

        LatLng stm_Iquique = new LatLng(-20.233054, -70.150544);
        mMap.addMarker(new MarkerOptions().position(stm_Iquique).title("Santo Tomás Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Iquique));

        LatLng stm_Antofagasta = new LatLng(-23.651808, -70.395381);
        mMap.addMarker(new MarkerOptions().position(stm_Antofagasta).title("Santo Tomás Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Antofagasta));

        LatLng stm_LaSerena = new LatLng(-29.912777, -71.252489);
        mMap.addMarker(new MarkerOptions().position(stm_LaSerena).title("Santo Tomás La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_LaSerena));

        LatLng stm_Vinia = new LatLng(-33.016667, -71.550000);
        mMap.addMarker(new MarkerOptions().position(stm_Vinia).title("Santo Tomás Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Vinia));

        LatLng stm_Santiago = new LatLng(-33.448891, -70.669266);
        mMap.addMarker(new MarkerOptions().position(stm_Santiago).title("Santo Tomás Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Santiago));

        LatLng stm_Talca = new LatLng(-35.432392, -71.655877);
        mMap.addMarker(new MarkerOptions().position(stm_Talca).title("Santo Tomás Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Talca));

        LatLng stm_Concepcion = new LatLng(-36.827744, -73.051846);
        mMap.addMarker(new MarkerOptions().position(stm_Concepcion).title("Santo Tomás Concepción"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Concepcion));

        LatLng stm_LosAngeles = new LatLng(-37.461111, -72.353611);
        mMap.addMarker(new MarkerOptions().position(stm_LosAngeles).title("Santo Tomás Los Ángeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_LosAngeles));

        LatLng stm_Temuco = new LatLng(-38.741301, -72.598614);
        mMap.addMarker(new MarkerOptions().position(stm_Temuco).title("Santo Tomás Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Temuco));

        LatLng stm_Valdivia = new LatLng(-39.814222, -73.245893);
        mMap.addMarker(new MarkerOptions().position(stm_Valdivia).title("Santo Tomás Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Valdivia));

        LatLng stm_Osorno = new LatLng(-40.573947, -73.124226);
        mMap.addMarker(new MarkerOptions().position(stm_Osorno).title("Santo Tomás Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_Osorno));

        LatLng stm_PuertoMontt = new LatLng(-41.465105, -72.942001);
        mMap.addMarker(new MarkerOptions().position(stm_PuertoMontt).title("Santo Tomás Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stm_PuertoMontt));
    }

    @Override//Utiliza este metodo para manejar los eventos del clic largo en el mapa
    public void onMapClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
    //Se actualiza los campos de texto con las cordenadas de latitud y longitud
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }





}