package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    public void onBtnClick(View view){
//        TextView txtHello = findViewById(R.id.txtView);
//        EditText edtTxtName = findViewById(R.id.edtTxtName);
//        txtHello.setText("Hello "+edtTxtName.getText().toString());
//    }

    public void onClickRegisterBtn(View view){
        TextView txtFName = findViewById(R.id.txtFName);
        TextView txtLName = findViewById(R.id.txtLName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText edtTxtFName = findViewById(R.id.edtTxtFName);
        EditText edtTxtLName = findViewById(R.id.edtTxtLName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFName.setText(edtTxtFName.getText().toString());
        txtLName.setText(edtTxtLName.getText().toString());
        txtEmail.setText(edtTxtEmail.getText().toString());
    }
}