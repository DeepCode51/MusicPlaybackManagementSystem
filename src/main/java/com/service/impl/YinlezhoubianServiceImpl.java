package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinlezhoubianDao;
import com.entity.YinlezhoubianEntity;
import com.service.YinlezhoubianService;
import com.entity.vo.YinlezhoubianVO;
import com.entity.view.YinlezhoubianView;

@Service("yinlezhoubianService")
public class YinlezhoubianServiceImpl extends ServiceImpl<YinlezhoubianDao, YinlezhoubianEntity> implements YinlezhoubianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlezhoubianEntity> page = this.selectPage(
                new Query<YinlezhoubianEntity>(params).getPage(),
                new EntityWrapper<YinlezhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlezhoubianEntity> wrapper) {
		  Page<YinlezhoubianView> page =new Query<YinlezhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlezhoubianVO> selectListVO(Wrapper<YinlezhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlezhoubianVO selectVO(Wrapper<YinlezhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlezhoubianView> selectListView(Wrapper<YinlezhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlezhoubianView selectView(Wrapper<YinlezhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
