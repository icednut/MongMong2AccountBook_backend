package io.github.mongmong2.accountbook.web;

import io.github.mongmong2.accountbook.repository.entity.AccountBill;
import io.github.mongmong2.accountbook.service.AccountBookPersistService;
import io.github.mongmong2.accountbook.service.param.AccountBillParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-01-25
 */
@RestController
@RequestMapping("/account-book")
public class AccountBookPersistController {
    @Autowired
    private AccountBookPersistService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<AccountBill>> getBillList() {
        return ResponseEntity.ok(service.getBillList());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> addBill(@RequestBody AccountBillParam accountBillParam) {
        return ResponseEntity.ok(service.addBill(accountBillParam));
    }
}
