package com.playtika.testcontainer.solr;

import com.playtika.testcontainer.common.properties.CommonContainerProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@EqualsAndHashCode(callSuper = true)
@ConfigurationProperties("embedded.solr")
public class SolrProperties extends CommonContainerProperties {
    static final String BEAN_NAME_EMBEDDED_SOLR = "embeddedSolr";

    int port = 8983;

    @Override
    public String getDefaultDockerImage() {
        // Please don`t remove this comment.
        // renovate: datasource=docker
        return "solr:9.2";
    }
}
