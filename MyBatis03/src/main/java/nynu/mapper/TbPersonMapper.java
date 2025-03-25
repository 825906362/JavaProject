package nynu.mapper;

import nynu.pojo.TbIdCard;
import nynu.pojo.TbPerson;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface TbPersonMapper {
    TbPerson findPersonById(Integer id);
    TbPerson findPersonById1(Integer id);

    @Select("select * from tb_person where id=#{id}")
    @Results({
            @Result(column = "card_id",property = "cardId"),
            @Result(column = "card_id",property="tbIdCard",
                    one = @One(select = "selectCardByCardId")
            )
    })
    TbPerson findPersonById3(Integer id);

    @Select("select * from tb_idcard where id=#{id}")
    TbIdCard selectCardByCardId(Integer id);
}
