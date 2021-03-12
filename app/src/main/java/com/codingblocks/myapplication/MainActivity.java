package com.codingblocks.myapplication;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantity = 0;
    int quantity1 = 0;
    public void threePoints(View view){

        quantity += 3;
        display(quantity);

    }
    public void threeP(View view)
    {
        quantity1 += 3;
        display1(quantity1);
    }
    public void twoP(View view)
    {
        quantity1 += 2;
        display1(quantity1);

    }
    public void oneP(View view) {

        display1(++quantity1);

    }
    public void display1(int i)
    {
        TextView tc = (TextView) findViewById(R.id.points1);
        tc.setText(""+ i);
    }
    public void twoPoints(View view)
    {
            quantity += 2;
            display(quantity);

    }
    public void reset(View view)
    {
        quantity=0;
        quantity1=0;
        display(0);
        display1(0);
    }
    public void onePoint(View view) {

        display(++quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.points);
        quantityTextView.setText("" + number);
    }
}