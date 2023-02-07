package com.example.mvvp_activity.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderGetKt;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvvp_activity.R;
import com.example.mvvp_activity.viewModel.ViewModels;

public class Views extends AppCompatActivity {
    EditText email,password;
    Button btn;
    ViewModels viewModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(view -> {
            viewModels.infoUser.observe(this, new Observer() {
                @Override
                public void onChanged(Object o) {
                    if(email.getText().toString().equals(viewModels.getEmail()) && password.getText().equals(viewModels.getPassword())){
                        Toast.makeText(Views.this, "Login successful", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(Views.this, "email or password is not valide", Toast.LENGTH_SHORT).show();
                    }



                }
            });
        });


    }
}