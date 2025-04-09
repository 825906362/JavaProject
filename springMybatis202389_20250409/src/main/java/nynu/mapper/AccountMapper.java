package nynu.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    @Update("update account set balance = balance - #{balance} where username =#{username}")
    Integer update(@Param("username") String username,
                   @Param("balance") double balance);
}
