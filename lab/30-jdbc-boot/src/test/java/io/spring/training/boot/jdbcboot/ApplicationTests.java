package io.spring.training.boot.jdbcboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.BDDAssertions.then;

// @SpringBootTest
@JdbcTest
class ApplicationTests {

    private static final String QUERY = "SELECT count(*) FROM T_ACCOUNT";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void testNumberOfAccount() {
		then(jdbcTemplate.queryForObject(QUERY, Long.class))
				.isEqualTo(21L);
    }


}
