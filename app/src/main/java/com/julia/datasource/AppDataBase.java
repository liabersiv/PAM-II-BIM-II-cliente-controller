package com.julia.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.julia.datamodel.ClienteDataModel;

public class AppDataBase {
    public static final String NAME = "atividade_julia.sqlite";
    public static int version = 1;

    SQLiteDataBase db;

    public AppDataBase(Context context) {
        super(context, NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG, "Criando a tabela " + ClienteDataModel.TABELA);
        db.execAQL(ClienteDataModel.criarTabela());
    }
}
