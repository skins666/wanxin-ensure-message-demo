package cn.itcast.wanxintx.ensuredemo.bank1.controller;

import cn.itcast.wanxintx.ensuredemo.bank1.model.AccountChangeEvent;
import cn.itcast.wanxintx.ensuredemo.bank1.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping(value = "/transfer")
    public String transfer(){
        accountInfoService.updateAccountBalance(new AccountChangeEvent("1",100,System.currentTimeMillis()));
        return "转账成功";
    }
}
