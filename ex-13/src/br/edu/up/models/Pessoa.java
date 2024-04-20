package br.edu.up.models;

public class Pessoa {
    private String nome;
    private char sexo; // 'M' para masculino, 'F' para feminino
    private int idade;
    private boolean saude; // true para apto, false para não apto

    public Pessoa(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isApto() {
        return saude && idade >= 18 && idade <= 30 && sexo == 'M';
    }
}
