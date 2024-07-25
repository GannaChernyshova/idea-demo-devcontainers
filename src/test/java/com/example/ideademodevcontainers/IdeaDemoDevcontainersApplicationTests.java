package com.example.ideademodevcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
class IdeaDemoDevcontainersApplicationTests {

    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
            "postgres:16-alpine"
    );

    @Test
    void contextLoads() {
        postgres.start();
        System.out.println(postgres.getJdbcUrl());
    }

}
