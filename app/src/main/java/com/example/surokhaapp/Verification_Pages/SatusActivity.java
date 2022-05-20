package com.example.surokhaapp.Verification_Pages;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.surokhaapp.R;
import com.example.surokhaapp.databinding.ActivitySatusBinding;

import java.util.Calendar;

public class SatusActivity extends AppCompatActivity {

    EditText eTextBirthday;

    private ActivitySatusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySatusBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

//Date of Birth


    }


}