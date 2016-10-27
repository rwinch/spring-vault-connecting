package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.vault.annotation.VaultPropertySource;

@Configuration
@VaultPropertySource("secret/my-application")
public class PropConfig {

	@Autowired
	Environment env;

	@Bean
	public Secrets testBean() {
		Secrets secrets = new Secrets();
		secrets.setSecretFromVault(env.getProperty("secret-from-vault"));
		secrets.setVaultToken(env.getProperty("vault.token"));
		return secrets;
	}
}