package com.dao;

import com.entity.GeshoufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GeshoufenleiVO;
import com.entity.view.GeshoufenleiView;


/**
 * 歌手分类
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface GeshoufenleiDao extends BaseMapper<GeshoufenleiEntity> {
	
	List<GeshoufenleiVO> selectListVO(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
	
	GeshoufenleiVO selectVO(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
	
	List<GeshoufenleiView> selectListView(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);

	List<GeshoufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
	
	GeshoufenleiView selectView(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
	

}
