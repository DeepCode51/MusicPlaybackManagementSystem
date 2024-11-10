package com.entity.view;

import com.entity.DiscussyinlezhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐周边评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@TableName("discussyinlezhoubian")
public class DiscussyinlezhoubianView  extends DiscussyinlezhoubianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyinlezhoubianView(){
	}
 
 	public DiscussyinlezhoubianView(DiscussyinlezhoubianEntity discussyinlezhoubianEntity){
 	try {
			BeanUtils.copyProperties(this, discussyinlezhoubianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
