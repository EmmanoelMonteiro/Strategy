package br.projetos.strategy;

public class ConnectionSqlServer implements Connection{
    @Override
    public void toConnect(){
        System.out.println("Conectar com o SQLServer");
    }
}
