package com.mycompany.aula04;

public class Principal {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(222, 898, 8000.00);
        Pessoa p1 = new Pessoa("111.111.111-11", "Jean-Rémi", "(27) 99999-9999", 25, 1.75, 70.0);

        System.out.println("Saldo da Conta: " + c1.getSaldo());
        
        // Exemplo de uso para verificar se funcionou
        System.out.println("DADOS DO CLIENTE:");
        System.out.println("CPF: " + p1.CPF);
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Telefone: " + p1.telefone);
        System.out.println("Altura:: " + p1.altura);
        System.out.println("Peso: " + p1.peso);
    }
}

class Pessoa {

    String nome, CPF, telefone;
    int idade;
    double altura, peso;

    // Construtor da classe | O NOME POUCO IMPORTA, O QUE IMPORTA É >TIPO<
    Pessoa(String CPF, String nome, String telefone,
            int idade, double altura, double peso) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
}