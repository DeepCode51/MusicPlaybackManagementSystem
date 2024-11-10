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


import com.dao.GeshoufenleiDao;
import com.entity.GeshoufenleiEntity;
import com.service.GeshoufenleiService;
import com.entity.vo.GeshoufenleiVO;
import com.entity.view.GeshoufenleiView;

@Service("geshoufenleiService")
public class GeshoufenleiServiceImpl extends ServiceImpl<GeshoufenleiDao, GeshoufenleiEntity> implements GeshoufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GeshoufenleiEntity> page = this.selectPage(
                new Query<GeshoufenleiEntity>(params).getPage(),
                new EntityWrapper<GeshoufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GeshoufenleiEntity> wrapper) {
		  Page<GeshoufenleiView> page =new Query<GeshoufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GeshoufenleiVO> selectListVO(Wrapper<GeshoufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GeshoufenleiVO selectVO(Wrapper<GeshoufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GeshoufenleiView> selectListView(Wrapper<GeshoufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GeshoufenleiView selectView(Wrapper<GeshoufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
