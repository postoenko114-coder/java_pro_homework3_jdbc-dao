package academy.prog.case3hw;

import academy.prog.case1.ClientDAO;
import academy.prog.case1.ClientDAOImpl;
import academy.prog.case2.ClientDAOImpl2;
import academy.prog.shared.Client;
import academy.prog.shared.ConnectionFactory;
import academy.prog.shared.Flat;

import javax.xml.transform.stream.StreamSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            FlatDAOImpl dao = new FlatDAOImpl(conn, "Flats");
            dao.createTable(Flat.class);

            Flat f1 = new Flat("District 1", "Shevchenko ,12 ", 82, 3, 200000);
            Flat f2 = new Flat("District 1", "Popova ,1 ", 30, 1, 20000);
            Flat f3 = new Flat("District 1", "Vatutina ,22 ", 55, 2, 100000);
            Flat f4 = new Flat("District 1", "Svobody ,78 ", 99, 4, 300000);

            dao.add(f1);
            dao.add(f2);
            dao.add(f3);
            dao.add(f4);

            List<Flat> list = dao.getAll(Flat.class);
            for (Flat flat : list) {
                System.out.println(flat.toString());
            }

            System.out.println("------");

            List<Flat> list2 = dao.getListByArea(60, Flat.class);
            for (Flat flat : list2) {
                System.out.println(flat.toString());
            }

            System.out.println("------");

            List<Flat> list3 = dao.getListByRange(80000, 220000, Flat.class);
            for (Flat flat : list3) {
                System.out.println(flat.toString());
            }


        }
    }
}



