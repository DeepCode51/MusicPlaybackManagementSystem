package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlefenleiView;


/**
 * 音乐分类
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface YinlefenleiService extends IService<YinlefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlefenleiVO> selectListVO(Wrapper<YinlefenleiEntity> wrapper);
   	
   	YinlefenleiVO selectVO(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
   	
   	List<YinlefenleiView> selectListView(Wrapper<YinlefenleiEntity> wrapper);
   	
   	YinlefenleiView selectView(@Param("ew") Wrapper<YinlefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlefenleiEntity> wrapper);
   	

}

