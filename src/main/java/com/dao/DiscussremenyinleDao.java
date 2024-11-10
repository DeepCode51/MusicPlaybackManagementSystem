package com.dao;

import com.entity.DiscussremenyinleEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenyinleVO;
import com.entity.view.DiscussremenyinleView;


/**
 * 热门音乐评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussremenyinleDao extends BaseMapper<DiscussremenyinleEntity> {
	
	List<DiscussremenyinleVO> selectListVO(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
	
	DiscussremenyinleVO selectVO(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
	
	List<DiscussremenyinleView> selectListView(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);

	List<DiscussremenyinleView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
	
	DiscussremenyinleView selectView(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
	

}
