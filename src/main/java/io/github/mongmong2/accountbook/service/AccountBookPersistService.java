package io.github.mongmong2.accountbook.service;

import io.github.mongmong2.accountbook.repository.AccountBookRepository;
import io.github.mongmong2.accountbook.repository.entity.AccountBill;
import io.github.mongmong2.accountbook.service.param.AccountBillParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-01-25
 */
@Slf4j
@Service
public class AccountBookPersistService {
    private static final String SUCCESS = "SUCCESS";

    @Autowired
    private AccountBookRepository repository;

    public String addBill(AccountBillParam accountBillParam) {
        AccountBill accountBill = accountBillParam.toEntity();

        AccountBill savedBill = repository.save(accountBill);
        log.debug("ID: {}", savedBill.getAccountBillId());
        return SUCCESS;
    }

    public List<AccountBill> getBillList() {
        return repository.findAll();
    }
}
