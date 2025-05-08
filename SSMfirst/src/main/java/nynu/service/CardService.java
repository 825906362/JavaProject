package nynu.service;


import nynu.pojo.Card;

import java.util.List;

public interface CardService {
    /*查找所有Card*/
    List<Card> findAllCard();

    Integer addCard(Card card);
}
