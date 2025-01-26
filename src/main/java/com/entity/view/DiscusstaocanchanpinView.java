package com.entity.view;

import com.entity.DiscusstaocanchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐产品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-17 23:09:41
 */
@TableName("discusstaocanchanpin")
public class DiscusstaocanchanpinView  extends DiscusstaocanchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstaocanchanpinView(){
	}
 
 	public DiscusstaocanchanpinView(DiscusstaocanchanpinEntity discusstaocanchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusstaocanchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
