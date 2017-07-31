package com.kyee.chis.db_show;

import com.kyee.chis.db_show.dao.entity.HisTables;
import com.kyee.chis.db_show.dao.mapper.HisTablesMapper;
import com.kyee.chis.db_show.service.ShowTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.cs.HistoricallyNamedCharset;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbShowApplicationTests {

	@Autowired
	private ShowTableService showTableService;

	@Test
	public void contextLoads() {

		HisTables hisTables = new HisTables();

		hisTables.setTableName("test12").setModule("test1").setTableComment("test12");

		showTableService.addHisTables(hisTables);
		//List<HisTables> hisTables1 = showTableService.getHisTables();
		System.out.println(hisTables);

	}

}
