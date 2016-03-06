package io.github.mongmong2.accountbook.web;

import io.github.mongmong2.accountbook.entity.AccountBookBill;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-02-11
 */
public class BillPersistControllerTest {
    private BillPersistController billPersistController = new BillPersistController();

    @Test
    public void testGetBillList() throws Exception {
        ResponseEntity<AccountBookBill> response = billPersistController.getBillList();

        Assert.assertThat(response.getStatusCode(), CoreMatchers.is(HttpStatus.OK));
        Assert.assertThat(response.getBody(), CoreMatchers.is(CoreMatchers.notNullValue()));
    }
}