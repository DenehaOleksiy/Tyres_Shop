package shop_DB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import shop_DB.entity.User;

/**
 * Created by Администратор on 14.07.2016.
 */
public interface UserRepo extends JpaRepository<User,Integer>{

    @Query("SELECT u FROM User u WHERE u.emailAdress LIKE :param OR u.phoneNumber LIKE :param")
    User findUserByLogin(@Param("param")String login);


}
