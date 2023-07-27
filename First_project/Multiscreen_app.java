/*
package com.example.multiple_screen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.multiple_screen_app.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PlaceHolder(View view){
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String message = "Order for " +  editText1.getText().toString() + ", " + editText2.getText().toString() +
                         " & " + editText3.getText().toString() + " is placed.";

        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}
 */
/*
package com.example.multiple_screen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        TextView textview = findViewById(R.id.OrderId);
        textview.setText(message);
    }
}
 */
//Note : to add a going back option from new page, go to Android Manifest and write
//       android:parentActivityName=".MainActivity" next to android:name=".OrderActivity"