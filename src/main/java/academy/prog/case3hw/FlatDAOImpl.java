package academy.prog.case3hw;

import academy.prog.shared.Flat;

import java.sql.Connection;

public class FlatDAOImpl extends FlatAbstractDAO<Flat> {
    public FlatDAOImpl(Connection conn, String table) {
        super(conn, table);
    }
}
