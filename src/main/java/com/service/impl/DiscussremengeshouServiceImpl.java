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


import com.dao.DiscussremengeshouDao;
import com.entity.DiscussremengeshouEntity;
import com.service.DiscussremengeshouService;
import com.entity.vo.DiscussremengeshouVO;
import com.entity.view.DiscussremengeshouView;

@Service("discussremengeshouService")
public class DiscussremengeshouServiceImpl extends ServiceImpl<DiscussremengeshouDao, DiscussremengeshouEntity> implements DiscussremengeshouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremengeshouEntity> page = this.selectPage(
                new Query<DiscussremengeshouEntity>(params).getPage(),
                new EntityWrapper<DiscussremengeshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremengeshouEntity> wrapper) {
		  Page<DiscussremengeshouView> page =new Query<DiscussremengeshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremengeshouVO> selectListVO(Wrapper<DiscussremengeshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremengeshouVO selectVO(Wrapper<DiscussremengeshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremengeshouView> selectListView(Wrapper<DiscussremengeshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremengeshouView selectView(Wrapper<DiscussremengeshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
