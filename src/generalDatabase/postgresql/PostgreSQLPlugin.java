package generalDatabase.postgresql;

import generalDatabase.DBControl;
import generalDatabase.DBSystem;
import generalDatabase.plugins.DBPluginInterface;

public class PostgreSQLPlugin implements DBPluginInterface {

	private String jarFile;
	
	@Override
	public String getDefaultName() {
		return PostgreSQLSystem.SYSTEMNAME;
	}

	@Override
	public String getHelpSetName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJarFile(String jarFile) {
		this.jarFile = jarFile;
	}

	@Override
	public String getJarFile() {
		return jarFile;
	}

	@Override
	public String getDeveloperName() {
		return "Doug Gillespie";
	}

	@Override
	public String getContactEmail() {
		return "pamguard@pamguard.org";
	}

	@Override
	public String getVersion() {
		return "0.0.1";
	}

	@Override
	public String getPamVerDevelopedOn() {
		return "2.3.0";
	}

	@Override
	public String getPamVerTestedOn() {
		return "2.3.0";
	}

	@Override
	public String getAboutText() {
		return PostgreSQLSystem.SYSTEMNAME + " database interface";
	}

	@Override
	public DBSystem getDatabaseSystem(DBControl dbControl, int settingsStore) {
		return new PostgreSQLSystem(dbControl, settingsStore);
	}

}
