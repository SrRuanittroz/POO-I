package com.mycompany.aula04;

public class Conta {

    int agencia, numero;
    double saldo;

    Conta() {

    }

    Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    int getAgencia() {
        return agencia;
    }

    void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    int getNumero() {
        return numero;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
