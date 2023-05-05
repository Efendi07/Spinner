package com.mnurulefendi202102256.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4, _spinnerPrima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = findViewById(R.id.spinner1);
        _spinner2 = findViewById(R.id.spinner2);
        _spinner3 = findViewById(R.id.spinner3);
        _spinner4 = findViewById(R.id.spinner4);
        _spinnerPrima = findViewById(R.id.spinnerPrima);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
        bilPrima();
    }

    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buahList);
        _spinner1.setAdapter(arrayAdapter1);
    }

    private void initSpinner2(){
        List<String> mahasiswaList = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            mahasiswaList.add("Mahasiswa ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinner2.setAdapter(arrayAdapter2);
    }

    private void initSpinner3(){
        List<String> ganjilList = new ArrayList<>();
        for(int i = 1; i <= 999; i+=2){
            ganjilList.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spinner3.setAdapter(arrayAdapter3);
    }

    private void initSpinner4(){
        List<String> genapList = new ArrayList<>();
        for(int i = 2; i <= 1000; i+=2){
            genapList.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        _spinner4.setAdapter(arrayAdapter4);
    }

    private void bilPrima(){
        List<String> primaList = new ArrayList<>();
        primaList.add("Angka Prima");
        for(int i = 0; i <= 1000; i++){
            int _bilPrima = 0;
            for (int j=1; j<=1; j++){
                if(i % j == 0){
                    _bilPrima = _bilPrima+1;
                }
            }
            if (_bilPrima == 2){
                primaList.add("Bilangan ke-" + i);
            }
        }
        ArrayAdapter<String> _AdPrima = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, primaList);
        _spinnerPrima.setAdapter(_AdPrima);
    }
}