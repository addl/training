package addl.lion.training.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import addl.lion.training.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
	
	@Query("select t from Payment t where t.userId =:userId")
	List<Payment> findByUserId(@Param("userId") String userId);
	
	@Query("select t from Payment t where t.accountFrom =:accountFrom")
	List<Payment> findbyFromAccount(@Param("accountFrom") String accountFrom);

}
