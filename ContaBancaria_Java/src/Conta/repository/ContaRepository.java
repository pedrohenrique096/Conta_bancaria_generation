package Conta.repository;

import Conta.model.Conta;

public interface ContaRepository {
    //CRUD da Conta
    public void procurarPorNumero (int numero);
    public void listarNumero();
    public void cadastrar (Conta conta);
    public void atualizar (Conta conta);
    public void deletar (int numero);

    //Métodos Bancários
    public void sacar (int numero, float valor);
    public void depositar (int numero, float valor);
    public void transferir (int numOrigem, int numeroDestino, float valor);


}
