package io.github.mongmong2.accountbook.repository;

import io.github.mongmong2.accountbook.repository.entity.AccountBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-01-25
 */
@Repository
public interface AccountBookRepository extends JpaRepository<AccountBill, Long> {
}
