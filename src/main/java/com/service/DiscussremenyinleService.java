package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenyinleEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenyinleVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenyinleView;


/**
 * 热门音乐评论表
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface DiscussremenyinleService extends IService<DiscussremenyinleEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenyinleVO> selectListVO(Wrapper<DiscussremenyinleEntity> wrapper);
   	
   	DiscussremenyinleVO selectVO(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
   	
   	List<DiscussremenyinleView> selectListView(Wrapper<DiscussremenyinleEntity> wrapper);
   	
   	DiscussremenyinleView selectView(@Param("ew") Wrapper<DiscussremenyinleEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenyinleEntity> wrapper);
   	

}

