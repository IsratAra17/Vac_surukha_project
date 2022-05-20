package com.example.surokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

import com.example.surokhaapp.Verification_Pages.CertificateActivity;
import com.example.surokhaapp.Verification_Pages.GetcardActivity;
import com.example.surokhaapp.Verification_Pages.QuestionActivity;
import com.example.surokhaapp.Verification_Pages.RegisterActivity;
import com.example.surokhaapp.Verification_Pages.SatusActivity;
import com.example.surokhaapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        binding.ibregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(send);
            }
        });


        binding.ib1Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, SatusActivity.class);
                startActivity(send);
            }
        });
        binding.ib2Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, GetcardActivity.class);
                startActivity(send);
            }
        });
        binding.ib3Certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, CertificateActivity.class);
                startActivity(send);
            }
        });
        binding.ib4Question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(MainActivity.this, QuestionActivity.class);
                startActivity(send);
            }
        });

}
}