package io.github.mongmong2.accountbook.service.param;

import io.github.mongmong2.accountbook.repository.entity.AccountBill;
import io.github.mongmong2.accountbook.repository.entity.type.YesNo;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-01-25
 */
@Getter
@Setter
public class AccountBillParam {
    private String title;
    private String subTitle;
    private YesNo isAdd;
    private Long accountMount;

    public AccountBill toEntity() {
        return AccountBill.builder()
                          .title(this.title)
                          .subTitle(this.subTitle)
                          .isAdd(this.isAdd)
                          .accountMount(accountMount)
                          .build();
    }
}
