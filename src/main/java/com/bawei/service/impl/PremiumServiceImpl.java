package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.PremiumDao;
import com.bawei.pojo.Premium;
import com.bawei.service.PremiumService;
@Service
public class PremiumServiceImpl implements PremiumService{
	@Autowired
	private PremiumDao premiumDao;
	
	@Override
	public List<Premium> list(Integer id) {
		// TODO Auto-generated method stub
		return premiumDao.list(id);
	}

	@Override
	public Premium selectById(Integer id) {
		// TODO Auto-generated method stub
		return premiumDao.selectById(id);
	}

	@Override
	public List<Premium> option() {
		// TODO Auto-generated method stub
		return premiumDao.option();
	}

	@Override
	public boolean update(Premium p) {
		// TODO Auto-generated method stub
		return premiumDao.update(p);
	}

}
