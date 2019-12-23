package addl.lion.training.config.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig {

	public DevDataSourceConfig() {
		System.out.println("DevDataSource executed constructor");
	}

	@Override
	public void setup() {
		System.out.println("Setting up datasource for DEV environment. ");
	}

}
