package br.com.desafioweb.greeting.ws;

import java.util.concurrent.atomic.AtomicLong;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(name="greetingservice")

public class GreetingImpl implements GreetingService {
	
	private static final String template = "Hello, %s!";
	private static final AtomicLong counter = new AtomicLong();
	
	

	@Override
	public Greeting greeting(String name) {
		// TODO Auto-generated method stub
		Greeting greeting = new Greeting();
		greeting.setId(counter.incrementAndGet());
		greeting.setContent(String.format(template, name));
		return greeting;
	}

}
