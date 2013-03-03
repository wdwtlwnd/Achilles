package info.archinnov.achilles.entity.metadata;

import info.archinnov.achilles.dao.CounterDao;

/**
 * CounterProperties
 * 
 * @author DuyHai DOAN
 * 
 */
public class CounterProperties
{
	private String fqcn;
	private CounterDao dao;

	public CounterProperties(String fqcn, CounterDao counterDao) {
		this.fqcn = fqcn;
		this.dao = counterDao;
	}

	public String getFqcn()
	{
		return fqcn;
	}

	public void setFqcn(String fqcn)
	{
		this.fqcn = fqcn;
	}

	public CounterDao getDao()
	{
		return dao;
	}

	public void setDao(CounterDao dao)
	{
		this.dao = dao;
	}

}