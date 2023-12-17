package utilities;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;;

@Sources({ "file:environmentConfig/${env}.properties" })
public interface Environment extends Config{
	// Hàm getter
	@Key("app.url")
	String appUrl();
	
	@Key("App.User")
	String appUser();
	
	@Key("App.Pass")
	String appPass();
	
	@Key("DB.Host")
	String dbHost();
	
	@Key("DB.User")
	String dbUser();
	
	@Key("DB.Post")
	String dbPost();
	
	
}
