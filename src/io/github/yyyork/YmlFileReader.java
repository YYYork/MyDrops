package io.github.yyyork;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class YmlFileReader {
    FileConfiguration config;
    public YmlFileReader(){
        config = MyDrops.instance.getConfig();
    }

    public List<String> getVaildWorlds(){
        List list = config.getList("Enable-worlds");
        List<String> strList = new ArrayList<>();
        for(Object name:list){
            strList.add((String)name);
        }
        return strList;
    }
}
