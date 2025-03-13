package nynu.mapper;

import nynu.pojo.TbPerson;

public interface TbPersonMapper {
    TbPerson findPersonById(Integer id);
    TbPerson findPersonById1(Integer id);
}
