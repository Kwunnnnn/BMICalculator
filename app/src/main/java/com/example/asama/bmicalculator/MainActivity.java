package com.example.asama.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int mode;
    int height;
    int weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calButton = (Button) findViewById(R.id.button_calculate);
        final EditText editHeight = (EditText) findViewById(R.id.fillHeight);
        final EditText editWeight = (EditText) findViewById(R.id.fillWeight);



            calButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(editHeight.length() == 0 || editWeight.length() == 0){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("ผิดพลาด");
                        dialog.setMessage("ป้อนข้อมูลไม่ครบ");
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {

                            }
                        });
                        dialog.show();
                    }
                    else {
                        height = editHeight.getHeight();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("Height",height);
                        startActivity(intent);
                    }
                }
            });




    }
}
