package com.example.applocalizacao

import android.app.Activity
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class GetLocationActivity : AppCompatActivity() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var latitude: TextView
    private lateinit var longitude: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_location)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        latitude = findViewById(R.id.latitude)
        longitude = findViewById(R.id.longitude)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            getLocation()
        }
    }

    private fun getLocation(){
        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this , arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 100)
            return
        }

        val location = fusedLocationClient.lastLocation
        location.addOnSuccessListener {
            if(it != null){
                val textLatitude = "Latitude " + it.latitude.toString()
                val textLongitude = "Longitude " + it.longitude.toString()
                latitude.text = textLatitude
                longitude.text = textLongitude
            }
        }
    }
}