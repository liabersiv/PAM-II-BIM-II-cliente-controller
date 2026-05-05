package com.julia.model;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String rua;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String nome) { this.email = email; }

    public String getRua() { return rua; }
    public void setRua (String rua) { this.rua = rua; }

    public String getCep() { return cep; }
    public void setCep (String cep) { this.cep = cep; }

    public String getEndereco() { return endereco; }
    public void setEndereco (String endereco) { this.endereco = endereco; }

    public String getCidade() { return cidade; }
    public void setCidade (String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado (String estado) { this.estado = estado; }

    public String getTelefone() { return telefone; }
    public void setTelefone (String telefone) { this.telefone = telefone; }


}
