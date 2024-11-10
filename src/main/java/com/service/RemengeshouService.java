package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemengeshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemengeshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemengeshouView;


/**
 * 热门歌手
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface RemengeshouService extends IService<RemengeshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemengeshouVO> selectListVO(Wrapper<RemengeshouEntity> wrapper);
   	
   	RemengeshouVO selectVO(@Param("ew") Wrapper<RemengeshouEntity> wrapper);
   	
   	List<RemengeshouView> selectListView(Wrapper<RemengeshouEntity> wrapper);
   	
   	RemengeshouView selectView(@Param("ew") Wrapper<RemengeshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemengeshouEntity> wrapper);
   	

}

