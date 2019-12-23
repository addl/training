package addl.lion.training.persistence;

import org.springframework.data.repository.CrudRepository;

import addl.lion.training.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
