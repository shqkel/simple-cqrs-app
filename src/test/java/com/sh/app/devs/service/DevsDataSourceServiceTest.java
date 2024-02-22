package com.sh.app.devs.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevsDataSourceServiceTest {
    @Autowired
    private DevsDataSourceService devsDataSourceService;

    @DisplayName("primary")
    @Test
    public void testPrimary() throws Exception {
        devsDataSourceService.primary();
    }
    @DisplayName("secondary")
    @Test
    public void testSecondary() throws Exception {
        devsDataSourceService.secondary();
    }
}