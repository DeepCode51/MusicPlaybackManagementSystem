package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenyinleEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenyinleVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenyinleView;


/**
 * 热门音乐
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface RemenyinleService extends IService<RemenyinleEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenyinleVO> selectListVO(Wrapper<RemenyinleEntity> wrapper);
   	
   	RemenyinleVO selectVO(@Param("ew") Wrapper<RemenyinleEntity> wrapper);
   	
   	List<RemenyinleView> selectListView(Wrapper<RemenyinleEntity> wrapper);
   	
   	RemenyinleView selectView(@Param("ew") Wrapper<RemenyinleEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenyinleEntity> wrapper);
   	

}

