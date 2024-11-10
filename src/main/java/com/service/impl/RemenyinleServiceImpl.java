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


import com.dao.RemenyinleDao;
import com.entity.RemenyinleEntity;
import com.service.RemenyinleService;
import com.entity.vo.RemenyinleVO;
import com.entity.view.RemenyinleView;

@Service("remenyinleService")
public class RemenyinleServiceImpl extends ServiceImpl<RemenyinleDao, RemenyinleEntity> implements RemenyinleService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenyinleEntity> page = this.selectPage(
                new Query<RemenyinleEntity>(params).getPage(),
                new EntityWrapper<RemenyinleEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenyinleEntity> wrapper) {
		  Page<RemenyinleView> page =new Query<RemenyinleView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenyinleVO> selectListVO(Wrapper<RemenyinleEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenyinleVO selectVO(Wrapper<RemenyinleEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenyinleView> selectListView(Wrapper<RemenyinleEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenyinleView selectView(Wrapper<RemenyinleEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
