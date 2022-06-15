package org.ttk.maxwell.authority.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages = { "org.ttk.maxwell.authority.dao" })
@Configuration
public class DaoConfig {

//    private static final String username    = "root";
//    private static final String password    = "123456";
//    private static final String jdbcUrl     = "jdbc:mysql://localhost:3306/db_maxwell?useUnicode=true&characterEncoding=utf8&useSSL=false&characterSetResults=UTF-8&useAffectedRows=true&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&connectTimeout=2000&socketTimeout=20000&serverTimezone=Asia/Shanghai";
//    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
//
//    @Bean
//    public HikariDataSource dataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setUsername(username);
//        config.setPassword(password);
//        config.setJdbcUrl(jdbcUrl);
//        config.setDriverClassName(driverClass);
//        return new HikariDataSource(config);
//    }

}
