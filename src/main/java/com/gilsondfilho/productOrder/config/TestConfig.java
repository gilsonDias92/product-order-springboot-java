package com.gilsondfilho.productOrder.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gilsondfilho.productOrder.entities.Category;
import com.gilsondfilho.productOrder.entities.Order;
import com.gilsondfilho.productOrder.entities.Product;
import com.gilsondfilho.productOrder.entities.User;
import com.gilsondfilho.productOrder.entities.enums.OrderStatus;
import com.gilsondfilho.productOrder.repositories.CategoryRepository;
import com.gilsondfilho.productOrder.repositories.OrderRepository;
import com.gilsondfilho.productOrder.repositories.ProductRepository;
import com.gilsondfilho.productOrder.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		User user1 = new User(null, "Jane Brown", "janeb@gmail.com", "988333888", "123456");
		User user2 = new User(null, "Nate Gibbins", "ngibbins@gmail.com", "972347777", "123456");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, user1);

		userRepository.saveAll(Arrays.asList(user1, user2));

		orderRepository.saveAll(Arrays.asList(o1, o2, o3));


	}
}