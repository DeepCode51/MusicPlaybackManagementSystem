package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlezhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlezhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlezhoubianView;


/**
 * 音乐周边
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface YinlezhoubianService extends IService<YinlezhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlezhoubianVO> selectListVO(Wrapper<YinlezhoubianEntity> wrapper);
   	
   	YinlezhoubianVO selectVO(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
   	
   	List<YinlezhoubianView> selectListView(Wrapper<YinlezhoubianEntity> wrapper);
   	
   	YinlezhoubianView selectView(@Param("ew") Wrapper<YinlezhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlezhoubianEntity> wrapper);
   	

}

