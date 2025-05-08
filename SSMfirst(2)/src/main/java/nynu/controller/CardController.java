package nynu.controller;

import nynu.pojo.Card;
import nynu.pojo.User;
import nynu.service.CardService;
import nynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.List;

@Controller
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(HttpSession session){
        System.out.println("进入index");
        List<Card> cardList = cardService.findAllCard();
        System.out.println("获取到cardList:"+cardList);
        session.setAttribute("cardList",cardList);
        return "index";
    }
    @RequestMapping(value="/postFile",method = RequestMethod.POST)
    public String postFile(Card card,Model model){
        System.out.println("进入postFile");
        System.out.println("获取到card:"+card);
        Integer row=cardService.addCard(card);
        if(row>0){
            model.addAttribute("PostMessage","发布成功!!!");
        } else{
            model.addAttribute("PostMessage","发布失败!!!");
        }
        return "post";
    }
}
