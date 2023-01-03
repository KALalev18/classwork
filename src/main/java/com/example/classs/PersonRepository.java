package com.example.classs;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends RowMapper<Person,Integer> {


}
