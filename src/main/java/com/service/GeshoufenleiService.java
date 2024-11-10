package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GeshoufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GeshoufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GeshoufenleiView;


/**
 * 歌手分类
 *
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public interface GeshoufenleiService extends IService<GeshoufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GeshoufenleiVO> selectListVO(Wrapper<GeshoufenleiEntity> wrapper);
   	
   	GeshoufenleiVO selectVO(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
   	
   	List<GeshoufenleiView> selectListView(Wrapper<GeshoufenleiEntity> wrapper);
   	
   	GeshoufenleiView selectView(@Param("ew") Wrapper<GeshoufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GeshoufenleiEntity> wrapper);
   	

}

