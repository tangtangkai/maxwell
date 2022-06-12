package org.ttk.maxwell.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@MapperScan(basePackages = { "org.ttk.maxwell.dao" })
@Configuration
public class DaoConfig {

    private final String username    = "root";
    private final String password    = "123456";
    private final String jdbcUrl     = "jdbc:mysql://localhost:3306/db_maxwell?useUnicode=true&characterEncoding=utf8&useSSL=false&characterSetResults=UTF-8&useAffectedRows=true&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&connectTimeout=2000&socketTimeout=20000&serverTimezone=Asia/Shanghai";
    private final String driverClass = "com.mysql.cj.jdbc.Driver";

    @Bean
    public HikariDataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setUsername(username);
        config.setPassword(password);
        config.setJdbcUrl(jdbcUrl);
        config.setDriverClassName(driverClass);
        return new HikariDataSource(config);
    }

}
