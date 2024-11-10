package com.dao;

import com.entity.YinlefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlefenleiVO;
import com.entity.view.YinlefenleiView;


/**
 * 音乐分类
 * 
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface YinlefenleiDao extends BaseMapper<YinlefenleiEntity> {
	
	List<YinlefenleiVO> selectListVO(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
	
	YinlefenleiVO selectVO(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
	
	List<YinlefenleiView> selectListView(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);

	List<YinlefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
	
	YinlefenleiView selectView(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
	

}
