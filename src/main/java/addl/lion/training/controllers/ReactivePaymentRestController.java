package addl.lion.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import addl.lion.training.domain.Payment;
import addl.lion.training.persistence.PaymentRepository;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping("/payments")
public class ReactivePaymentRestController {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@GetMapping("/all")
	private Mono<List<Payment>> getEmployeeById() {
		System.out.println("Enter reactive controller");
	    return Mono.defer(() -> Mono.just(paymentRepository.findByUserId("45"))).
	    		subscribeOn(Schedulers.elastic()).doAfterTerminate(System.out::println);
	}
}
