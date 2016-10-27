package sample;

public class Secrets {
	private String vaultToken;
	private String secretFromVault;

	public void setVaultToken(String vaultToken) {
		this.vaultToken = vaultToken;
	}

	public void setSecretFromVault(String secretFromVault) {
		this.secretFromVault = secretFromVault;
	}

	public String getVaultToken() {
		return vaultToken;
	}

	public String getSecretFromVault() {
		return secretFromVault;
	}
}
