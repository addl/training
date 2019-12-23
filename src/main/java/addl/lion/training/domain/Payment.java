package addl.lion.training.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userId;
	private String accountFrom;
	private String accountTo;
	private Long amount;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	
	public Payment(String userId, String accountFrom, String acountTo, Long amount) {
		this.userId = userId;
		this.accountFrom = accountFrom;
		this.accountTo = acountTo;
		this.amount = amount;
	}

	public Payment(Long id, String userId, String accountFrom, String accountTo, Long amount) {
		this.id = id;
		this.userId = userId;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}

	public String getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
