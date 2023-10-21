package com.jack.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@ActiveProfiles("test")
@Sql(scripts = "classpath:script_sql/utente.sql")
public class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository animalRepository;

    @Test
    public void test(){

    }

}
