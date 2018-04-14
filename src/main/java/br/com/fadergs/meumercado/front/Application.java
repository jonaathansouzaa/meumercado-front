package br.com.fadergs.meumercado.front;

import org.springframework.web.client.RestTemplate;

import br.com.fadergs.meumercado.front.json.Produto;

public class Application {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
        Produto product = restTemplate.getForObject("http://localhost:8080/meumercado/produto/nome/Twix", Produto.class);
        System.out.println(product);
	}
	
}
