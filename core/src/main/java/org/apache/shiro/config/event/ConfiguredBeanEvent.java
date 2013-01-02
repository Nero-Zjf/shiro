package org.apache.shiro.config.event;

import java.util.Map;

/**
 * @since 1.3
 */
public class ConfiguredBeanEvent extends BeanEvent {

    public ConfiguredBeanEvent(final String beanName, final Object bean, final Map<String, Object> beanContext) {
        super(beanName, bean, beanContext);
    }
}
