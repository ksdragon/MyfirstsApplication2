package com.example.dragon.myapplication2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.dragon.myapplication2.R.id.button1;
import static com.example.dragon.myapplication2.R.id.button2;
import static com.example.dragon.myapplication2.R.id.button3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b1 = (Button) findViewById(button1);
        Button b2 = (Button) findViewById(button2);
        Button b3 = (Button) findViewById(button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    private void buttonClick(View v) {
        String name = ((Button) v).getText().toString();  // extract name form button properties
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        //TextView tv = (TextView) findViewById(R.id.textViewMessage);
        //tv.setText("button");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
