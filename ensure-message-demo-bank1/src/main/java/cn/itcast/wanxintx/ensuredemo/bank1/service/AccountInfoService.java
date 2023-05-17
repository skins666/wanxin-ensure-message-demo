package cn.itcast.wanxintx.ensuredemo.bank1.service;

import cn.itcast.wanxintx.ensuredemo.bank1.model.AccountChangeEvent;

public interface AccountInfoService {
    /**
     * 更新帐号余额-发送消息
     * @param accountChange
     */
    void updateAccountBalance(AccountChangeEvent accountChange);
    /**
     * 更新帐号余额-本地事务
     * @param accountChange
     */
    void doUpdateAccountBalance(AccountChangeEvent accountChange);
}
