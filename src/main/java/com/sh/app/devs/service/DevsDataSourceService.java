package com.sh.app.devs.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@Service
@RequiredArgsConstructor
@Slf4j
public class DevsDataSourceService {

    private final DataSource dataSource;

    @Transactional
    public void primary() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info("primary url : {}", connection.getMetaData().getURL());
    }

    @Transactional(readOnly = true)
    public void secondary() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info("secondary url : {}", connection.getMetaData().getURL());
    }

}