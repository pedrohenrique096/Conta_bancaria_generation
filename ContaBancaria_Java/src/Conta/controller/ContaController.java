package Conta.controller;

import Conta.model.Conta;
import Conta.repository.ContaRepository;

import java.util.ArrayList;

public class ContaController implements ContaRepository {
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    int numero = 0;


    @Override
    public void procurarPorNumero(int numero) {
        var conta = buscarNaCollection(numero);
        if (conta!=null)
            conta.visualizar();
        else
            System.out.println("\nA conta número: "+numero+" não foi encontrada!");

    }

    @Override
    public void listarNumero() {
    }

    @Override
    public void cadastrar(Conta conta) {
        listaContas.add(conta);
        System.out.println("\nA Conta número: "+conta.getNumero()+" foi criada com sucesso!");
    }

    @Override
    public void atualizar(Conta conta) {
        var buscaConta = buscarNaCollection(conta.getNumero());

        if (buscaConta != null){
            listaContas.set(listaContas.indexOf(buscaConta),conta);
            System.out.println("\nA conta número: "+conta.getNumero()+" foi atualizada com sucesso! ");
        }else
            System.out.println("\nA conta número: "+conta.getNumero()+" não foi encontrada!");

    }

    @Override
    public void deletar(int numero) {
        var conta = buscarNaCollection(numero);
        if (conta!= null){
            if (listaContas.remove(conta)==true)
                System.out.println("\nA conta número: "+numero+" foi deletada com sucesso!");
        }else
            System.out.println("\nA conta número: "+numero+" não foi encontrada.");
    }

    @Override
    public void sacar(int numero, float valor) {
        var conta = buscarNaCollection(numero);

        if (conta != null){
           if (conta.sacar(valor) == true)
               System.out.println("\nO saque na conta de número "+numero+" foi efetuado com sucesso!");
        }else
            System.out.println("\nA conta de número "+numero+" não foi encontrada!");
    }

    @Override
    public void depositar(int numero, float valor) {
        var conta = buscarNaCollection(numero);

        if (conta != null){
            conta.depositar(valor);
            System.out.println("O Depósito na conta de número: "+numero+" foi concluido com sucesso!");
        }else
            System.out.println("\nA conta de número: "+numero+" não foi encontrada ou a Conta destino não é uma Conta Corrente!");
    }

    @Override
    public void transferir(int numOrigem, int numeroDestino, float valor) {
    var contaOrigem = buscarNaCollection(numOrigem);
    var contaDestino = buscarNaCollection(numeroDestino);

    if (contaOrigem != null && contaDestino != null){
        if (contaOrigem.sacar(valor) == true){
            contaDestino.depositar(valor);
            System.out.println("Transferência efetuada com sucesso!");
        }
    }else
        System.out.println("\nA conta de Origem e/ou Destino não foram encontradas!");
    }
    public void listarTodas(){
        for (var conta : listaContas){
            conta.visualizar();
        }
    }
        public int gerarNumero(){
        return ++ numero;
    }
    public Conta buscarNaCollection(int numero){
        for (var conta : listaContas){
            if (conta.getNumero()== numero){
                return conta;
            }
        }
        return null;
    }
    public int retornaTipo (int numero){
        for (var conta : listaContas){
            if (conta.getNumero()==numero){
                return conta.getTipo();
            }
        }
        return 0;
    }

}
