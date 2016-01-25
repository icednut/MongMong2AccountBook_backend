package io.github.mongmong2.accountbook.repository.entity;

import io.github.mongmong2.accountbook.repository.entity.type.YesNo;
import lombok.*;

import javax.persistence.*;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-01-25
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_BILL_ID")
    private Long accountBillId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "SUBTITLE")
    @Lob
    private String subTitle;

    @Column(name = "IS_ADD")
    @Enumerated
    private YesNo isAdd = YesNo.Y;

    @Column(name = "ACCOUNT_MOUNT")
    private Long accountMount = 0L;
}
