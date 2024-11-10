package com.dao;

import com.entity.DiscussyinlezhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlezhoubianVO;
import com.entity.view.DiscussyinlezhoubianView;


/**
 * 音乐周边评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussyinlezhoubianDao extends BaseMapper<DiscussyinlezhoubianEntity> {
	
	List<DiscussyinlezhoubianVO> selectListVO(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
	
	DiscussyinlezhoubianVO selectVO(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
	
	List<DiscussyinlezhoubianView> selectListView(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);

	List<DiscussyinlezhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
	
	DiscussyinlezhoubianView selectView(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
	

}
