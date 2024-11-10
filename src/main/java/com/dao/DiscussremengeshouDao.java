package com.dao;

import com.entity.DiscussremengeshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremengeshouVO;
import com.entity.view.DiscussremengeshouView;


/**
 * 热门歌手评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussremengeshouDao extends BaseMapper<DiscussremengeshouEntity> {
	
	List<DiscussremengeshouVO> selectListVO(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
	
	DiscussremengeshouVO selectVO(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
	
	List<DiscussremengeshouView> selectListView(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);

	List<DiscussremengeshouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
	
	DiscussremengeshouView selectView(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
	

}
