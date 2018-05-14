package com.station.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.station.bean.Pager;
import com.station.entity.BaseStationInfo;
import com.station.service.BaseStationInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class springBootManageApplicationTests {

	@Autowired
	private BaseStationInfoService BaseStationInfoSer;
	
	@Test
	public void springTest() {
		BaseStationInfo baseStationInfo = new BaseStationInfo();
		Pager findForPager = BaseStationInfoSer.findForPager(baseStationInfo);
		System.out.println(findForPager);
	}
}
