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


import com.dao.YinlefenleiDao;
import com.entity.YinlefenleiEntity;
import com.service.YinlefenleiService;
import com.entity.vo.YinlefenleiVO;
import com.entity.view.YinlefenleiView;

@Service("yinlefenleiService")
public class YinlefenleiServiceImpl extends ServiceImpl<YinlefenleiDao, YinlefenleiEntity> implements YinlefenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlefenleiEntity> page = this.selectPage(
                new Query<YinlefenleiEntity>(params).getPage(),
                new EntityWrapper<YinlefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlefenleiEntity> wrapper) {
		  Page<YinlefenleiView> page =new Query<YinlefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlefenleiVO> selectListVO(Wrapper<YinlefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlefenleiVO selectVO(Wrapper<YinlefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlefenleiView> selectListView(Wrapper<YinlefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlefenleiView selectView(Wrapper<YinlefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
