package jp.co.skillup.bssapp.common.config;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.dialect.Dialect;

/**
 * Domaの設定ファイル
 */
public class DomaConfig extends DomaAbstractConfig {

	/** データソース */
	private DataSource dataSource;

	private Dialect dialect;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}

}
