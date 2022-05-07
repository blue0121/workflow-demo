package workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workflow.model.UserEntity;

import java.util.Collection;
import java.util.List;

/**
 * @author Jin Zheng
 * @since 2022-05-07
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUsername(String username);

	List<UserEntity> findByUsernameIn(Collection<String> usernameList);
}
