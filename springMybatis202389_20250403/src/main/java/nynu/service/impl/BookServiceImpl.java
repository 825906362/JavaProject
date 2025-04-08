package nynu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nynu.mapper.BookMapper;
import nynu.mapper.UserMapper;
import nynu.pojo.Book;
import nynu.pojo.User;
import nynu.service.BookService;
import nynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
       // return bookMapper.findAll();
        QueryWrapper<Book> queryWrapper=new QueryWrapper<Book>();
        queryWrapper.like("bookname","数据库");
        queryWrapper.isNotNull("price");
        return bookMapper.selectList(queryWrapper);
    }
    public  Book findById(Integer id){
        return bookMapper.selectById(id);
    }
}
