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
    // 注入BookMapper
    @Autowired
    BookMapper bookMapper;

    // 实现BookService接口中的findAll方法
    @Override
    public List<Book> findAll() {
       // return bookMapper.findAll();
        // 创建QueryWrapper对象
        QueryWrapper<Book> queryWrapper=new QueryWrapper<Book>();
        // 查询bookname中包含"数据库"的记录
        queryWrapper.like("bookname","数据库");
        // 查询price不为空的记录
        queryWrapper.isNotNull("price");
        // 返回查询结果
        return bookMapper.selectList(queryWrapper);
    }
    // 根据id查询Book对象
    public  Book findById(Integer id){
        // 根据id查询Book对象
        return bookMapper.selectById(id);
    }
}
