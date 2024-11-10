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


import com.dao.RemengeshouDao;
import com.entity.RemengeshouEntity;
import com.service.RemengeshouService;
import com.entity.vo.RemengeshouVO;
import com.entity.view.RemengeshouView;

@Service("remengeshouService")
public class RemengeshouServiceImpl extends ServiceImpl<RemengeshouDao, RemengeshouEntity> implements RemengeshouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemengeshouEntity> page = this.selectPage(
                new Query<RemengeshouEntity>(params).getPage(),
                new EntityWrapper<RemengeshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemengeshouEntity> wrapper) {
		  Page<RemengeshouView> page =new Query<RemengeshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemengeshouVO> selectListVO(Wrapper<RemengeshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemengeshouVO selectVO(Wrapper<RemengeshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemengeshouView> selectListView(Wrapper<RemengeshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemengeshouView selectView(Wrapper<RemengeshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
