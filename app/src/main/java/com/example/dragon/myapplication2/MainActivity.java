package com.example.dragon.myapplication2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.dragon.myapplication2.R.id.button1;
import static com.example.dragon.myapplication2.R.id.button2;
import static com.example.dragon.myapplication2.R.id.button3;
import static com.example.dragon.myapplication2.R.id.textView1;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private TextView textView;
    private TextView textMessage1;
    private GestureDetectorCompat gestureDetector;

/*    public  static  final String NAPIS ="napis_na_etykiecie";

    @Override
    protected void onSaveInstanceState(Bundle outState){
        TextView tv1=(TextView) findViewById(textView1);
        outState.putString(NAPIS, tv1.getText().toString());
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void  onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        TextView tv=(TextView) findViewById(textView1);
        tv.setText(savedInstanceState.getString(NAPIS));
    }*/


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        textView.setText("onSingleTapConfirmed");
        textMessage1.setText("onSingle Tap MyTekst");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        textView.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        textView.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        textView.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        textView.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        textView.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        textView.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("onFling");
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    } // MousionEvent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       /* if (savedInstanceState!=null){
            TextView tv2 =(TextView) findViewById(textView1);
            tv2.setText(savedInstanceState.getString(NAPIS));
        }
*/
        textView = (TextView)findViewById(R.id.textView1);
        textMessage1 = (TextView)findViewById(R.id.textMessage1);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);


        Button b1 = (Button) findViewById(button1);
        Button b2 = (Button) findViewById(button2);
        Button b3 = (Button) findViewById(button3);

        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});

        b2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});
        b3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonClick(v);
            }});

        b3.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView tv = (TextView) findViewById(textView1);
                        tv.setText("Ustawiam na false");
                        return true;
                    }
                }
        );





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
        TextView tv = (TextView) findViewById(textView1);
        tv.setText(name);

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
