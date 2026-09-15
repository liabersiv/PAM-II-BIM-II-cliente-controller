package com.julia;

import android.graphics.Insets;
import android.os.Bundle;
import android.view.WindowInsets;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.julia.controller.Clientecontroller;

public class MainActivity extends AppCompatActivity {
    Clientecontroller clientecontroller;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clientecontroller =  new Clientecontroller(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v,);
        Insets systemaBars = insets.getInsets(WindowInsetsCompat).Type.systemBars());
        v.setPadding(systemBars)

    }
}
