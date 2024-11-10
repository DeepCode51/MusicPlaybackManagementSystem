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


import com.dao.DiscussremenyinleDao;
import com.entity.DiscussremenyinleEntity;
import com.service.DiscussremenyinleService;
import com.entity.vo.DiscussremenyinleVO;
import com.entity.view.DiscussremenyinleView;

@Service("discussremenyinleService")
public class DiscussremenyinleServiceImpl extends ServiceImpl<DiscussremenyinleDao, DiscussremenyinleEntity> implements DiscussremenyinleService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenyinleEntity> page = this.selectPage(
                new Query<DiscussremenyinleEntity>(params).getPage(),
                new EntityWrapper<DiscussremenyinleEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenyinleEntity> wrapper) {
		  Page<DiscussremenyinleView> page =new Query<DiscussremenyinleView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenyinleVO> selectListVO(Wrapper<DiscussremenyinleEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenyinleVO selectVO(Wrapper<DiscussremenyinleEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenyinleView> selectListView(Wrapper<DiscussremenyinleEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenyinleView selectView(Wrapper<DiscussremenyinleEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
