package com.example.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Person;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveWithDataActivity;
    Button btnDialPhone;
//    Button btnMoveWithObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

//        btnMoveWithObject = findViewById(R.id.btn_move_activity_object);
//        btnMoveWithObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
                
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;

//            case R.id.btn_move_activity_object:
//                Person person = new Person();
//                person.setName("DicodingAcademy");
//                person.setAge(5);
//                person.setEmail("academy@dicoding.com");
//                person.setCity("Bandung");
//
//                Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithObjectActivity.class);
//                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
//                startActivity(moveWithObjectIntent);
//                break;
                
            case R.id.btn_dial_number:
                String phoneNumber = "081392083101";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
