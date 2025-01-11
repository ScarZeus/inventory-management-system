package repository;

import model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepo extends JpaRepository<UserModel,Long> {
}
