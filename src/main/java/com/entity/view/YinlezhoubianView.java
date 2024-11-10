package com.entity.view;

import com.entity.YinlezhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐周边
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@TableName("yinlezhoubian")
public class YinlezhoubianView  extends YinlezhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlezhoubianView(){
	}
 
 	public YinlezhoubianView(YinlezhoubianEntity yinlezhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, yinlezhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
