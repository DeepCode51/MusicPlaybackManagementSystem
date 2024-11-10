package com.dao;

import com.entity.RemenyinleEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenyinleVO;
import com.entity.view.RemenyinleView;


/**
 * 热门音乐
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface RemenyinleDao extends BaseMapper<RemenyinleEntity> {
	
	List<RemenyinleVO> selectListVO(@Param("ew") Wrapper<RemenyinleEntity> wrapper);
	
	RemenyinleVO selectVO(@Param("ew") Wrapper<RemenyinleEntity> wrapper);
	
	List<RemenyinleView> selectListView(@Param("ew") Wrapper<RemenyinleEntity> wrapper);

	List<RemenyinleView> selectListView(Pagination page,@Param("ew") Wrapper<RemenyinleEntity> wrapper);
	
	RemenyinleView selectView(@Param("ew") Wrapper<RemenyinleEntity> wrapper);
	

}
