package com.hjw.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by 黄毅 on 2017/6/21.
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${dialect}")
    private String dialect;
    @Value("${show_sql}")
    private String show_sql;
    @Value("${hbm2ddl.auto}")
    private String hbm2ddl_auto;
    @Value("${packagesToScan}")
    private String packages_to_scan;


}
