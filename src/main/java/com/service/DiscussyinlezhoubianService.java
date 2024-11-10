package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlezhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlezhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlezhoubianView;


/**
 * 音乐周边评论表
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussyinlezhoubianService extends IService<DiscussyinlezhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlezhoubianVO> selectListVO(Wrapper<DiscussyinlezhoubianEntity> wrapper);
   	
   	DiscussyinlezhoubianVO selectVO(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
   	
   	List<DiscussyinlezhoubianView> selectListView(Wrapper<DiscussyinlezhoubianEntity> wrapper);
   	
   	DiscussyinlezhoubianView selectView(@Param("ew") Wrapper<DiscussyinlezhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlezhoubianEntity> wrapper);
   	

}

