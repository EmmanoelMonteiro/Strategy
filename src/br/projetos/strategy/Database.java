package br.projetos.strategy;

public class Database {

    private Connection connection;

    public void setConnection(Connection connection){
        this.connection = connection;
    }
    public void toConnect(){
        connection.toConnect();
    }
}
