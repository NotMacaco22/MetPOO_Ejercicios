package org.cash;

import org.cash.models.ConnectionDataBase;
import org.cash.models.QueriesSQL;

public class Main {

    public static void main(String[] args){

        QueriesSQL queriesSQL = new QueriesSQL();

        queriesSQL.allInfoStudents();
        System.out.println("\n-----------------------\n");
        queriesSQL.insertStudent("Intellij Idea 2", "2024-10-01");
        queriesSQL.allInfoStudents();

        ConnectionDataBase.getInstance().closeConnection();

    }

}