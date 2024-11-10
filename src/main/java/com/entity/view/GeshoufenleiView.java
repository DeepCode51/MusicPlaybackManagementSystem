package com.entity.view;

import com.entity.GeshoufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 歌手分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@TableName("geshoufenlei")
public class GeshoufenleiView  extends GeshoufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GeshoufenleiView(){
	}
 
 	public GeshoufenleiView(GeshoufenleiEntity geshoufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, geshoufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
