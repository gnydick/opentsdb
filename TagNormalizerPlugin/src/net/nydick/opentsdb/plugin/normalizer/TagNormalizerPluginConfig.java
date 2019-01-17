package net.nydick.opentsdb.plugin.normalizer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.BasicHttpRequest;
import com.sun.deploy.net.HttpResponse;
import net.opentsdb.utils.PluginConfig;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

public class TagNormalizerPluginConfig extends PluginConfig {

    public TagNormalizerPluginConfig(String configUrl) {
        super(configUrl);
        try {
            this.loadFromOrch();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadFromOrch() throws IOException {

        URL orchUrl = new URL("http", "orch", 80, "/api/rest/v1/config/dev:infra:observ:opentsdb:default:normalizer_plugin:tag:default");

        BasicHttpRequest orchReq = new BasicHttpRequest();
        HttpResponse response = orchReq.doGetRequest(orchUrl);
        InputStream orchIs = response.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> jsonMap = mapper.readValue(orchIs, Map.class);

        this.properties = new Properties();
        properties.putAll(jsonMap);
    }

}
