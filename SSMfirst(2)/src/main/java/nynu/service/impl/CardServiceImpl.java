package nynu.service.impl;

import nynu.mapper.CardMapper;
import nynu.pojo.Card;
import nynu.pojo.User;
import nynu.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service("cardService")
public class CardServiceImpl implements CardService {
    @Autowired
    CardMapper cardMapper;

    @Override
    public List<Card> findAllCard() {
        return cardMapper.selectList(null);
    }

    @Override
    public Integer addCard(Card card) {
        Integer row=cardMapper.insert(card);
        return row;
    }

}
