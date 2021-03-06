package br.com.mongoblogs.repository;

import br.com.mongoblogs.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>
{
    User findByUsername(String username);
}
