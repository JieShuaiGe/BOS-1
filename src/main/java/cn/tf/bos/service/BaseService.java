package cn.tf.bos.service;

import java.util.List;

import javax.annotation.Resource;

import cn.tf.bos.dao.BaseDao;
import cn.tf.bos.domain.bc.Decidedzone;
import cn.tf.bos.domain.bc.Region;
import cn.tf.bos.domain.bc.Staff;
import cn.tf.bos.domain.bc.Standard;
import cn.tf.bos.domain.bc.Subarea;
import cn.tf.bos.domain.user.User;
import cn.tf.bos.page.PageRequestBean;
import cn.tf.bos.page.PageResponseBean;

public abstract class BaseService {
	@Resource(name="userDao")
	protected BaseDao<User> userDao ;
		
	@Resource(name="standardDao")
	protected BaseDao<Standard>  standardDao;
	
	
	@Resource(name="staffDao")
	protected BaseDao<Staff>  staffDao;
	
	
	@Resource(name="regionDao")
	protected BaseDao<Region>  regionDao;
	
	
	@Resource(name="subareaDao")
	protected BaseDao<Subarea>  subareaDao;
	
	@Resource(name="decidedzoneDao")
	protected BaseDao<Decidedzone>  decidedzoneDao;
	
	// 分页通用代码
	public <T> PageResponseBean pageQuery(PageRequestBean pageRequestBean, BaseDao<T> dao) {
		PageResponseBean pageResponseBean = new PageResponseBean();

		int firstResult = (pageRequestBean.getPage() - 1) * pageRequestBean.getRows(); // 　从哪条开始
		int maxResults = pageRequestBean.getRows(); // 返回记录数
		List<T> data = dao.findByPage(pageRequestBean.getDetachedCriteria(), firstResult, maxResults);
		pageResponseBean.setRows(data);

		// 满足当前条件，记录总条数
		long total = dao.findTotal(pageRequestBean.getDetachedCriteria());
		pageResponseBean.setTotal(total);
		
		return pageResponseBean;
	}
}
