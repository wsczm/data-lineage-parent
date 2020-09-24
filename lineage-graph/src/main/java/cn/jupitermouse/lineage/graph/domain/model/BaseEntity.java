package cn.jupitermouse.lineage.graph.domain.model;

import java.util.Map;

import cn.jupitermouse.lineage.graph.infra.constats.NeoConstant;
import org.neo4j.ogm.annotation.Properties;

/**
 * <p>
 * BaseEntity
 * </p>
 *
 * @author JupiterMouse 2020/09/22
 * @since 1.0
 */
public abstract class BaseEntity {

    /**
     * 图真实ID
     */
    private Long id;

    /**
     * 节点属性值
     */
    @Properties(prefix = NeoConstant.Graph.ATTR)
    private Map<String, String> attrs;

    public Map<String, String> getAttrs() {
        return attrs;
    }

    public void setAttrs(Map<String, String> attrs) {
        this.attrs = attrs;
    }
}
