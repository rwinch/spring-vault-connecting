package sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

@Configuration
@ComponentScan
public class VaultConfig extends AbstractVaultConfiguration {
	/**
	 * Specify an endpoint for connecting to Vault.
	 */
	@Override
	public VaultEndpoint vaultEndpoint() {
		VaultEndpoint vaultEndpoint = new VaultEndpoint();
		vaultEndpoint.setScheme("http");
		return vaultEndpoint;
	}

	/**
	 * Configure a client authentication. Please consider a more secure
	 * authentication method for production use.
	 */
	@Override
	public ClientAuthentication clientAuthentication() {
		return new TokenAuthentication(System.getProperty("vault.token"));
	}
}
