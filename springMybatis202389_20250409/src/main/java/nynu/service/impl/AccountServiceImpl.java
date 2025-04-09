package nynu.service.impl;

import nynu.mapper.AccountMapper;
import nynu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    //转账
    @Override
    public void transfer(String from, String to, double money) {
        accountMapper.update(from,money);
        int a=3/0;
        accountMapper.update(to,-money);
    }
}

