package br.projetos.strategy;

public class ConnectionMongoDB implements Connection{
    @Override
    public void toConnect(){
        System.out.println("Conectar com o MongoDB");
    }
}
