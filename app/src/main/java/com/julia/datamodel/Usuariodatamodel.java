package com.julia.datamodel;

public class Usuariodatamodel {

        public static final String TABELA = "usuario";

        public static final String id = "id";
        public static final String nome = "nome";
        public static final String email = "email";
        public static final String senha = "senha";

        public static String criarTabela(){

            return "CREATE TABLE " + TABELA + "("
                    + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + nome + " TEXT, "
                    + email + " TEXT, "
                    + senha + " TEXT )";
        }


    }
