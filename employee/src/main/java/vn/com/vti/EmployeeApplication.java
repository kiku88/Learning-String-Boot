package vn.com.vti;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import vn.com.vti.entity.Employee;
import vn.com.vti.repository.EmployeeRepository;

@EnableAutoConfiguration
@ComponentScan
@MapperScan("vn.com.vti.mapper")
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(EmployeeApplication.class);

		builder.headless(false);

		ConfigurableApplicationContext context = builder.run(args);
	}
	
	@Bean
	public DataSource dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder
			.setType(EmbeddedDatabaseType.HSQL) //.H2 or .DERBY
			.addScript("db/sql/db.sql")
			.build();

//		org.hsqldb.util.DatabaseManager.main(new String[] {
//				  "--url",  "jdbc:hsqldb:mem:testdb", "--noexit"
//				});

		return db;
	}
	
	@Bean
    CommandLineRunner init (EmployeeRepository employeeRepository){
        return args -> {
        	Employee emp1 = new Employee();
        	emp1.setEmpNo(1001);
        	emp1.setName("田中");
        	Employee emp2 = new Employee();
        	emp2.setEmpNo(1002);
        	emp2.setName("鈴木");
        	Employee emp3 = new Employee();
        	emp3.setEmpNo(1003);
        	emp3.setName("佐藤");

        	ArrayList<Employee> employees = new ArrayList<Employee>();
            employees.add(emp1);
            employees.add(emp2);
            employees.add(emp3);

            employees.forEach(employee -> employeeRepository.save(employee));
        };
    }

}
