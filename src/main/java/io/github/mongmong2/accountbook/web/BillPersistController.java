package io.github.mongmong2.accountbook.web;

import io.github.mongmong2.accountbook.entity.AccountBookBill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-02-11
 */
@RequestMapping("/bill")
@RestController
public class BillPersistController {

    public ResponseEntity<AccountBookBill> getBillList() {
        return ResponseEntity.ok(null);
    }
}
