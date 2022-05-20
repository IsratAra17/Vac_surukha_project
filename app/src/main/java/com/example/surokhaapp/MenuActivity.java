package com.example.surokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.surokhaapp.Verification_Pages.CertificateActivity;
import com.example.surokhaapp.Verification_Pages.GetcardActivity;
import com.example.surokhaapp.Verification_Pages.RegisterActivity;
import com.example.surokhaapp.Verification_Pages.SatusActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // enable the home button
        ActionBar actionBar = getActionBar();
        actionBar.setHomeButtonEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Intent send = new Intent(MenuActivity.this, SatusActivity.class);
                startActivity(send);
                break;
            // Something else
            case R.id.menu2:
                Intent send1 = new Intent(MenuActivity.this, CertificateActivity.class);
                startActivity(send1);
            case R.id.menu3:
                Intent send2 = new Intent(MenuActivity.this, GetcardActivity.class);
                startActivity(send2);
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}