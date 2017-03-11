package br.com.leoSistemas.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="configurationMB")
public class ConfigurationControllerMB {

	private String nameApp = "ControlLab WEB";

	public String getNameApp() {
		return nameApp;
	}

	public void setNameApp(String nameApp) {
		this.nameApp = nameApp;
	}
	
	
}
