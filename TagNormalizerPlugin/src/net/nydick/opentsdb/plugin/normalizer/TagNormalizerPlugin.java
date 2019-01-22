package net.nydick.opentsdb.plugin.normalizer;

import net.opentsdb.core.TSDB;
import net.opentsdb.normalize.NormalizePlugin;
import net.opentsdb.stats.StatsCollector;
import net.opentsdb.utils.PluginConfig;

import java.util.HashMap;
import java.util.Map;

public class TagNormalizerPlugin extends NormalizePlugin {


    public TagNormalizerPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }


    @Override
    public void initialize(TSDB tsdb) {

    }

    @Override
    public com.stumbleupon.async.Deferred<Object> shutdown() {
        return null;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void collectStats(StatsCollector collector) {

    }

    public Map<String, String> cleanTags(Map<String, String> dirtytags) {
        HashMap<String, String> tags = new HashMap<>(dirtytags.size());
        tags.putAll(dirtytags);


        return tags;
    }

}
