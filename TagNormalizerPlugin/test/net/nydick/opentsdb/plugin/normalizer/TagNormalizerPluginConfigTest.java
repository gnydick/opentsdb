package net.nydick.opentsdb.plugin.normalizer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import static org.junit.Assert.*;

public class TagNormalizerPluginConfigTest {


    @org.junit.Test
    public void getConfig() {
        TagNormalizerPluginConfig tnpc = new TagNormalizerPluginConfig("foo");
        Properties foo = tnpc.getConfig();

    }
}
