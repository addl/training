package addl.lion.training.config.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionDatasourceConfig implements DataSourceConfig {

	public ProductionDatasourceConfig() {
		System.out.println("Production Datasource initialized");
	}

	@Override
	public void setup() {
		System.out.println("Setting up datasource for PRODUCTION environment. ");
	}

}
