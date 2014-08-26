package no.ciber.academy;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.net.URISyntaxException;
import java.sql.SQLException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class LocalApplication {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ctx = SpringApplication.run(LocalApplication.class, args);
        Server webServer = Server.createWebServer("-webPort", "8081");
        webServer.start();
    }

    @Bean
    public DataSource dataSource() throws URISyntaxException {
        JdbcDataSource basicDataSource = new JdbcDataSource();
        basicDataSource.setUrl("jdbc:h2:test");

        return basicDataSource;
    }

}
