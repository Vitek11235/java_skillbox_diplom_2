package main.service;

import main.api.response.SettingsRespons;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

    public SettingsRespons getGlobalSettings() {
        SettingsRespons settingsRespons = new SettingsRespons();
        settingsRespons.setPostPremoderation(true);
        settingsRespons.setStatisticsIsPublic(true);
        return settingsRespons;
    }
}
