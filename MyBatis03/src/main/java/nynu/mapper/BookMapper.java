package nynu.mapper;

import lombok.Data;
import nynu.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    @Select("select * from tb_book where id=#{id}")
    Book findBookById(Integer id);
    @Insert("insert into tb_book (id,bookname,price,author) values\n" +
            "            (#{id},#{bookname},#{price},#{author})")
    Integer insertBook(Book book);

    @Delete("delete from tb_book where id=#{id}")
    Integer deleteBook(Integer id);

    @Update("update tb_book set bookname=#{bookname} where id=#{id}")
    Integer updateBook(Book book);

    List<Book> findBookByName(String bookname);

    @Select("<script>select * from tb_book\n" +
            "        <where>\n" +
            "            <if test=\" bookname!=null and bookname!='' \">\n" +
            "                bookname like concat('%',#{bookname},'%')\n" +
            "            </if>\n" +
            "        </where> </script>")
    List<Book> findBookByName2(String bookname);
}
