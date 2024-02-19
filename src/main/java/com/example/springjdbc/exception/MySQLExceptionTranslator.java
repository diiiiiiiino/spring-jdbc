package com.example.springjdbc.exception;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.SQLExceptionTranslator;

import java.sql.SQLException;

public class MySQLExceptionTranslator implements SQLExceptionTranslator {
    @Override
    public DataAccessException translate(String task, String sql, SQLException ex) {
        return null;
    }
}
