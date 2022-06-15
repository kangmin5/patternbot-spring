package kr.co.patternbot.coin.controllers;


import kr.co.patternbot.coin.services.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러가 api 매핑url
@RestController
@RequiredArgsConstructor
@RequestMapping("/coins")
public class CoinController {
    private final CoinService service;

}
