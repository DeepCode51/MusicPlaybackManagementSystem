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


import com.dao.DiscussyinlezhoubianDao;
import com.entity.DiscussyinlezhoubianEntity;
import com.service.DiscussyinlezhoubianService;
import com.entity.vo.DiscussyinlezhoubianVO;
import com.entity.view.DiscussyinlezhoubianView;

@Service("discussyinlezhoubianService")
public class DiscussyinlezhoubianServiceImpl extends ServiceImpl<DiscussyinlezhoubianDao, DiscussyinlezhoubianEntity> implements DiscussyinlezhoubianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlezhoubianEntity> page = this.selectPage(
                new Query<DiscussyinlezhoubianEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlezhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlezhoubianEntity> wrapper) {
		  Page<DiscussyinlezhoubianView> page =new Query<DiscussyinlezhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlezhoubianVO> selectListVO(Wrapper<DiscussyinlezhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlezhoubianVO selectVO(Wrapper<DiscussyinlezhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlezhoubianView> selectListView(Wrapper<DiscussyinlezhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlezhoubianView selectView(Wrapper<DiscussyinlezhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
