package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremengeshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremengeshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremengeshouView;


/**
 * 热门歌手评论表
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussremengeshouService extends IService<DiscussremengeshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremengeshouVO> selectListVO(Wrapper<DiscussremengeshouEntity> wrapper);
   	
   	DiscussremengeshouVO selectVO(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
   	
   	List<DiscussremengeshouView> selectListView(Wrapper<DiscussremengeshouEntity> wrapper);
   	
   	DiscussremengeshouView selectView(@Param("ew") Wrapper<DiscussremengeshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremengeshouEntity> wrapper);
   	

}

