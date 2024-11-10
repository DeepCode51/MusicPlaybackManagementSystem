package com.entity.view;

import com.entity.DiscussremenyinleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门音乐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@TableName("discussremenyinle")
public class DiscussremenyinleView  extends DiscussremenyinleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremenyinleView(){
	}
 
 	public DiscussremenyinleView(DiscussremenyinleEntity discussremenyinleEntity){
 	try {
			BeanUtils.copyProperties(this, discussremenyinleEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
