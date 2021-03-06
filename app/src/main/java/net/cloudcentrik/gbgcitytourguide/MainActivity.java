package net.cloudcentrik.gbgcitytourguide;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitle("GBG City Tour Guide");




        // Tourist spots button
        final Button buttonTouristSpot = (Button) findViewById(R.id.gbg_btn_touristspots);
        buttonTouristSpot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent2 = new Intent(MainActivity.this, TouristSpotsActivity.class);
                startActivity(intent2);

            }
        });

        // shoping center button
        final Button btnShoppingCentre = (Button) findViewById(R.id.gbg_btn_shoping_center);
        btnShoppingCentre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent3 = new Intent(MainActivity.this, ShoppingCentreActivity.class);
                startActivity(intent3);



            }
        });


        // Btn resturent
        final Button buttonResturent = (Button) findViewById(R.id.gbg_btn_restaurent);
        buttonResturent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent4 = new Intent(MainActivity.this, ResturentActivity.class);
                startActivity(intent4);


            }
        });

        // Btn hotel
        final Button buttonHotel = (Button) findViewById(R.id.gbg_btn_hotel);
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent4 = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(intent4);
            }
        });

        // Btn infocenter
        final Button buttoninfocenter = (Button) findViewById(R.id.gbg_btn_info_center);
        buttoninfocenter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent5 = new Intent(MainActivity.this, InfoCenterActivity.class);
                startActivity(intent5);


            }
        });
           //
        final Button travelinfobutton = (Button) findViewById(R.id.gbg_btn_travel_info);
        travelinfobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent6 = new Intent(MainActivity.this, TravelInfoActivity.class);
                startActivity(intent6);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_museum) {
            Toast.makeText(MainActivity.this, "Seetings", Toast.LENGTH_LONG).show();

            return true;
        }
        if(id == R.id.action_island){
            Toast.makeText(MainActivity.this, "About", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_info){
            Toast.makeText(MainActivity.this, "information", Toast.LENGTH_LONG).show();
        }

        if(id == R.id.action_restuarent){
            Toast.makeText(MainActivity.this, "resturent", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_travelinfo){
            Toast.makeText(MainActivity.this, "travel info", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_infocenter){
            Toast.makeText(MainActivity.this, "info center", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);


    }


}
