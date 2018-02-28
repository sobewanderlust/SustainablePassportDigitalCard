package com.example.android.sustainablepassportdigitalcard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Open SP geolocation
    public void openGeolocation(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(Uri.parse("geo:0,0?q=" + getString(R.string.company_lat) + "," + getString(R.string.company_long) + "(" + getString(R.string.spName) + ")"));
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    // Open the Sustainable Passport's phone when clicking in the phone number
    public void openSPMobile(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + getString(R.string.spMobile)));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the Sustainable Passport's website when clicking the website
    public void openSPWebsite(View view) {
        Uri webpage = Uri.parse("http://" + getString(R.string.spWebsite));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Redirect to the SP's Facebook page
    public void redirectFacebook(View view) {
        Uri webpage = Uri.parse(getString(R.string.facebook_page));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Redirect to the SP's Twitter page
    public void redirectTwitter(View view) {
        Uri webpage = Uri.parse(getString(R.string.twitter_page));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Redirect to SP's Instagram page
    public void redirectInstagram(View view) {
        Uri webpage = Uri.parse(getString(R.string.instagram_page));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
