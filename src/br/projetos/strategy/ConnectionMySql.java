package br.projetos.strategy;

public class ConnectionMySql implements Connection{
    @Override
    public void toConnect(){
        System.out.println("Conectar com o MySql");
    }
}
