package sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = VaultConfig.class)
public class AppTests {
	@Autowired
	Secrets secrets;

	@Test
	public void validateSecrets() {
		assertThat(secrets.getSecretFromVault()).isEqualTo("vault");
		assertThat(secrets.getVaultToken()).isNotEmpty();
	}
}
