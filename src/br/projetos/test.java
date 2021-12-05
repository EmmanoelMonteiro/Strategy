package br.projetos;

import br.projetos.strategy.*;

public class test {

    public static void main(String[] args) {
        Connection SqlServer = new ConnectionSqlServer();
        Connection MySql = new ConnectionMySql();
        Connection Mongo = new ConnectionMongoDB();

        Database con = new Database();

        System.out.println("INICIO DO STRATEGY");
        System.out.println("###############################");
        con.setConnection(SqlServer);
        con.toConnect();
        System.out.println("###############################");
        con.setConnection(MySql);
        con.toConnect();
        System.out.println("###############################");
        con.setConnection(Mongo);
        con.toConnect();
    }


}
