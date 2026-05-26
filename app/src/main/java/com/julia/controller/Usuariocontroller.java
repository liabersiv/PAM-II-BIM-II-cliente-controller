package com.julia.controller;

import android.content.ContentValues;
import android.content.Context;

import com.julia.datamodel.Usuariodatamodel;
import com.julia.datasource.AppDataBase;
import com.julia.model.Usuario;

public class Usuariocontroller {

    public class UsuarioController {


        AppDataBase appDataBase;
        ContentValues dados;

        public UsuarioController(Context context) {
            appDataBase = new AppDataBase(context);
        }

        public boolean salvar(Usuario usuario){

            dados = new ContentValues();

            dados.put(Usuariodatamodel.EMAIL, usuario.getEmail());
            dados.put(Usuariodatamodel.SENHA, usuario.getSenha());

            return true;
        }


    }

}
