package com.example.classs;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface PlayerDaoo {
    Person mapRow(ResultSet resultSet, int rowNum) throws SQLException;

    void run(String... args) throws Exception;
}
