package com.mmj.www.newadapterviewspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);

        List<String> list = new ArrayList<String>();
        list.add("과일을 선택해주세요");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String select = ((TextView)view).getText().toString();
        String text = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
//        switch (((TextView) view).getText()){
//            case position == 1 :
        Bundle bundle = new Bundle();
        bundle.putString("detail",text);
        Intent intent = new Intent(this, bananaActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);


        }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
