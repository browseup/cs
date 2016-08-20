package io.khasang.cs.config;


import io.khasang.cs.dao.CatDao;
import io.khasang.cs.dao.impl.CatDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
//@PropertySource(value = {"classpath:util.properties"})
//@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {
    @Bean
    public CatDao catDao() {
        return new CatDaoImpl();
    }


//    @Autowired
//    Environment environment;
//
//    @Autowired
//    HibernateConfig hibernateConfig;

//    @Bean
//    public JdbcTemplate jdbcTemplate() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource());
//        return jdbcTemplate;
//    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
//        jdbcImpl.setDataSource(hibernateConfig.dataSource());
//        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
//        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
//        return jdbcImpl;
//    }
//
//    @Bean
//    public CreateTable createTable() {
//        return new CreateTable(jdbcTemplate());
//    }
//
//    @Bean
//    public OfferDAO offerDAO() {
//        return new OfferDAOImpl();
//    }

//    @Bean
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getProperty("jdbc.postgresql.driverClass"));
//        dataSource.setUrl(environment.getProperty("jdbc.postgresql.url"));
//        dataSource.setUsername(environment.getProperty("jdbc.postgresql.username"));
//        dataSource.setPassword(environment.getProperty("jdbc.postgresql.password"));
//        return dataSource;
//    }
}