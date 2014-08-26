package no.ciber.academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();


        SimpleDriverDataSource basicDataSource = new SimpleDriverDataSource();
        basicDataSource.setDriverClass(org.postgresql.Driver.class);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        //SimpleDataSource basicDataSource = new SimpleDataSource();
        //basicDataSource.setServerName(dbUri.getHost());
        //basicDataSource.setPortNumber(dbUri.getPort());
        //basicDataSource.setApplicationName(dbUri.getPath());
        //basicDataSource.setUser(username);
        //basicDataSource.setPassword(password);

        return basicDataSource;
    }
}
