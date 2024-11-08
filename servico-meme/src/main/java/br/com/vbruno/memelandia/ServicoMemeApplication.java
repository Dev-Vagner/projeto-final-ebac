package br.com.vbruno.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.vbruno.memelandia.repository")
@EnableFeignClients(basePackages = "br.com.vbruno.memelandia.feign")
public class ServicoMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoMemeApplication.class, args);
	}

}
