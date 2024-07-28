package de.telran.utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigValue;

import java.util.List;

public interface ConfigProvider {
    Config config = readConfig();
//This is a simple configuration file-reading interface with placeholders for implementing and usage during the tests
    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("applications.conf");
    }
//Field set for the config reading. Config file can be found in "resources" folder
    String URL = readConfig().getString("url");
    Integer ADMIN_BIRTHDATE = readConfig().getInt("usersParameters.admin.birthdate");
    Integer ADMIN_PHONE = readConfig().getInt("usersParameters.admin.phone");
    String ADMIN_EMAIL = readConfig().getString("usersParameters.admin.email");
    String ADMIN_PASSWORD = readConfig().getString("usersParameters.admin.password");
    String ADMIN_NAME = readConfig().getString("usersParameters.admin.name");
    String ADMIN_SURNAME = readConfig().getString("usersParameters.admin.surname");
    List<ConfigValue> ADMIN_GENDER = readConfig().getList("usersParameters.admin.gender");

    Integer USER_BIRTHDATE = readConfig().getInt("usersParameters.regularUser.birthdate");
    Integer USER_PHONE = readConfig().getInt("usersParameters.regularUser.phone");
    String USER_EMAIL = readConfig().getString("usersParameters.regularUser.email");
    String USER_PASSWORD = readConfig().getString("usersParameters.regularUser.password");
    String USER_NAME = readConfig().getString("usersParameters.regularUser.name");
    String USER_SURNAME = readConfig().getString("usersParameters.regularUser.surname");
    List<ConfigValue> USER_GENDER = readConfig().getList("usersParameters.regularUser.gender");
}
