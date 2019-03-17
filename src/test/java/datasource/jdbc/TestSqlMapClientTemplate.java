package datasource.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibatis.sqlmap.client.SqlMapClient;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:spring-ibatis.xml"
})
public class TestSqlMapClientTemplate {
	
	
	@Autowired
	private SqlMapClient sqlMapClient;
	
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	
	@Test
	public void testNotNull() {
		assertNotNull(sqlMapClient);
		assertNotNull(sqlMapClientTemplate);
	}
	
	
	

}
