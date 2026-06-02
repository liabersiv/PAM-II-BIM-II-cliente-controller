package com.julia.controller;

import android.content.Context;

import com.julia.datasource.AppDataBase;
import com.julia.model.Cliente;

public class Clientecontroller extends AppDataBase implements iCRUD<Cliente> {
    public Clientecontroller(Context context) {
        super(context);
    }
}
