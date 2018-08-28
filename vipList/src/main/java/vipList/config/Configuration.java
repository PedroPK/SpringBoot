package vipList.config;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Configuration {
	
	private static final String ROOT_PASSWORD = "RootPassword";
	private static final String ROOT_USER = "root";
	private static final String MY_VIP_LIST_DATABASE = "myviplist";
	private static final String JDBC_MYSQL_LOCALHOST_3306 = "jdbc:mysql://localhost:3306/";
	private static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(	COM_MYSQL_JDBC_DRIVER);
		dataSource.setUrl(				JDBC_MYSQL_LOCALHOST_3306	+	MY_VIP_LIST_DATABASE);
		dataSource.setUsername(			ROOT_USER);
		dataSource.setPassword(			ROOT_PASSWORD);
		
		return dataSource;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}
	
}