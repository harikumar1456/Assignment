package com.example.administrator.firstassignment;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    EditText textView;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      gridView=(GridView)findViewById(R.id.gridView);
      textView=(EditText)findViewById(R.id.editText);
      gridView.setAdapter(new CustomAdapter(MainActivity.this,14));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               b1= (Button) gridView.getItemAtPosition(position);
               b1.setText("h");
           }
       });


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        int count =0;
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            gridView.setNumColumns(8);
            gridView.setVerticalSpacing(-60);
            count=22;
        }
        else
        {
            gridView.setNumColumns(4);
            count=14;
        }
        gridView.setAdapter(new CustomAdapter(MainActivity.this, count));
        super.onConfigurationChanged(newConfig);
    }
}
