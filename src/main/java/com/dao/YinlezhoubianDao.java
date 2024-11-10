package com.dao;

import com.entity.YinlezhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlezhoubianVO;
import com.entity.view.YinlezhoubianView;


/**
 * 音乐周边
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface YinlezhoubianDao extends BaseMapper<YinlezhoubianEntity> {
	
	List<YinlezhoubianVO> selectListVO(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
	
	YinlezhoubianVO selectVO(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
	
	List<YinlezhoubianView> selectListView(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);

	List<YinlezhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
	
	YinlezhoubianView selectView(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
	

}
