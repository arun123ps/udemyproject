package com.ps.respository;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBconnectionmanager {
     static DataSource getDataSource() throws NamingException {

        Context context = new InitialContext();
        return (DataSource) context.lookup("java:comp/env/jdbc/udemy_clone");

    }

}
