package com.example.surokhaapp.Verification_Pages;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.surokhaapp.MainActivity;
import com.example.surokhaapp.ModelClass.ModelClass;
import com.example.surokhaapp.R;
import com.example.surokhaapp.Retrofit.ApiInterface;
import com.example.surokhaapp.Retrofit.Apiclient;
import com.example.surokhaapp.databinding.ActivityRegisterBinding;

import java.lang.reflect.Type;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RegisterActivity extends AppCompatActivity {
ApiInterface apiInterface;
    DatePickerDialog picker;
    EditText eText;
    TextView tvw;
    private ActivityRegisterBinding binding;
    String selectitem,dob;
    private int mYear, mMonth, mDay,dobY,dobM,dobD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_register);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectitem=  binding.spinner.getSelectedItem().toString();

                Toast.makeText(RegisterActivity.this, " "+selectitem, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


//dob
binding.Datepick.setInputType(InputType.TYPE_NULL);
binding.Datepick.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        pickDate();
        //dob=binding.Datepick.getText().toString();
    }
});

//Button register
        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert();
            }
        });


    }
    private void pickDate(){


        eText=(EditText) findViewById(R.id.Datepick);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(RegisterActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                               eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
dob=eText.getText().toString();
                            }
                        }, year, month, day);
                picker.show();
            }
        });


    }//pickdate


    private void insert(){


        Retrofit retrofit = Apiclient.getClint();
        apiInterface = retrofit.create(ApiInterface.class);



        ModelClass modelclass = new ModelClass(); //object for Modelclass

//category
        modelclass.setCategory(selectitem);
//nid
        modelclass.setNid(binding.etNationalId.getText().toString());
//dob
        modelclass.setDob(dob);

        apiInterface.insert(modelclass).enqueue(new Callback<ModelClass>() {
            @Override
            public void onResponse(Call<ModelClass> call, Response<ModelClass> response) {

                Toast.makeText(RegisterActivity.this, "inserted", Toast.LENGTH_LONG).show();
                Intent i = new Intent(RegisterActivity.this, RegisterActivity.class);
                startActivity(i);

            }

            @Override
            public void onFailure(Call<ModelClass> call, Throwable t) {

                Toast.makeText(RegisterActivity.this, " not inserted", Toast.LENGTH_LONG).show();

            }
        });


    }//insert


}

